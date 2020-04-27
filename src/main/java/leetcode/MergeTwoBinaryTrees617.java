package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-12-29 下午3:58
 * <p>
 * 类说明：
 */
public class MergeTwoBinaryTrees617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        TreeNode root = new TreeNode(0);
        travel(root, t1, t2);
        return root;
    }

    void travel(TreeNode root, TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            root = null;
            return;
        }
        int val1 = t1 == null ? 0 : t1.val;
        int val2 = t2 == null ? 0 : t2.val;
        root.val = val1 + val2;
        TreeNode left1 = t1 == null ? null : t1.left;
        TreeNode right1 = t1 == null ? null : t1.right;
        TreeNode left2 = t2 == null ? null : t2.left;
        TreeNode right2 = t2 == null ? null : t2.right;


        if (left1 != null || left2 != null) {
            root.left = new TreeNode(0);
            travel(root.left, left1, left2);

        }
        if (right1 != null || right2 != null) {
            root.right = new TreeNode(0);
            travel(root.right, right1, right2);

        }

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
