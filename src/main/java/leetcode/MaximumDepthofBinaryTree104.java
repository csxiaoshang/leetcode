package main.java.leetcode;



/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-25 下午9:32
 * <p>
 * 类说明：
 */
public class MaximumDepthofBinaryTree104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = Math.max(maxDepth(root.left),maxDepth(root.right));
        return max+1;
    }
}
