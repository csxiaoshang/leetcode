package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-28 下午6:57
 * <p>
 * 类说明：
 */
public class SecondMinimumNodeInaBinaryTree671 {
    long res = Integer.MAX_VALUE+1;

    public int findSecondMinimumValue(TreeNode root) {
        int min = root.val;

        getMin(root, min);
        return res == Integer.MAX_VALUE+1 ? -1 : (int) res;
    }

    private void getMin(TreeNode node, int min) {
        if (node.val != min) {
            res = Math.min(node.val, res);
        }
        if (node.left != null) {
            getMin(node.left, min);
        }
        if (node.right != null) {
            getMin(node.right, min);
        }
    }

/*    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;
        if (root.left == null && root.right == null) return -1;
        int leftVal = root.left.val;
        int rightVal = root.right.val;
        if (leftVal == root.val) leftVal = findSecondMinimumValue(root.left);
        if (rightVal == root.val) rightVal = findSecondMinimumValue(root.right);
        if (leftVal != -1 && rightVal != -1) return Math.min(leftVal, rightVal);
        if (leftVal != -1) return leftVal;
        return rightVal;
    }*/
}
