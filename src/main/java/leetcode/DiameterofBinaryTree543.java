package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-27 上午9:05
 * <p>
 * 类说明：
 */
public class DiameterofBinaryTree543 {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return max;
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        max = Math.max(max, left + right);
        return Math.max(left,right)+1;
    }
}
