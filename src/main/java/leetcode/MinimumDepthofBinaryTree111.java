package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-27 上午11:29
 * <p>
 * 类说明：
 */
public class MinimumDepthofBinaryTree111 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (left == 0 || right == 0) return left + right + 1;
        return Math.min(left, right) + 1;
    }
}
