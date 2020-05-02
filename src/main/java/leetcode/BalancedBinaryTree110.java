package main.java.leetcode;



/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-25 下午9:37
 * <p>
 * 类说明：
 */
public class BalancedBinaryTree110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = height(root.left);
        int right = height(root.right);
        boolean flag = Math.abs(left - right)<=1;
        return isBalanced(root.left)
                && isBalanced(root.right)
                && flag;
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);
        return Math.max(left,right)+1;
    }
}
