package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-12-30 上午9:16
 * <p>
 * 类说明：
 */
public class TrimABinarySearchTree669 {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null)
            return root;
        if (root.val > R)
            return trimBST(root.left, L, R);
        if (root.val < L)
            return trimBST(root.right, L, R);
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
