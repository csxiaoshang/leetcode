package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-27 上午10:30
 * <p>
 * 类说明：
 */
public class PathSum112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        return trace(root, sum, 0);
    }

    private boolean trace(TreeNode root, int sum, int tem) {
        if (root == null) {
            return false;
        }
        tem = tem + root.val;
        if (root.left == null && root.right == null && tem == sum) {
            return true;
        }
        return trace(root.left, sum, tem)
        ||trace(root.right, sum, tem);
    }
}
