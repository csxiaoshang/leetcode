package main.java.leetcode;



/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-22 上午8:39
 * <p>
 * 类说明：
 */
public class ValidateBinarySearchTree98 {
    public boolean isValidBST(TreeNode root) {
        return getAns(root, null, null);
    }

    private boolean getAns(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }
        if (min != null && node.val <= min) {
            return false;
        }
        if (max != null && node.val >= max) {
            return false;
        }
        return getAns(node.left, min, node.val) && getAns(node.right, node.val, max);
    }
}
