package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-12-24 上午9:39
 * <p>
 * 类说明：
 */
public class InvertBinaryTree226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
