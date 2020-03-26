package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-12-25 上午9:14
 * <p>
 * 类说明：
 */
public class SubtreeofAnotherTree572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        String s1 = preOrder(s);
        String t1 = preOrder(t);
        return s1.indexOf(t1) >= 0;
    }

    public String preOrder(TreeNode root) {
        if (root == null)
            return "null";
        return "*" + root.val + preOrder(root.left) + preOrder(root.right);
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
