package main.java.leetcode;

import main.java.TreeNode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-25 下午8:55
 * <p>
 * 类说明：
 */
public class SymmetricTree101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return check(root.left, root.right);
    }

    private boolean check(TreeNode left, TreeNode right) {
        //有且仅有一个为 null ，直接返回 false
        if (left == null && right != null || left != null && right == null) {
            return false;
        }
        if (left != null && right != null){
            //A 的根节点和 B 的根节点是否相等
            if (left.val != right.val) {
                return false;
            }
        //A 的左子树和 B 的右子树是否相等，同时 A 的右子树和左子树是否相等。
        return check(left.left, right.right) && check(left.right, right.left);
    }
    //都为 null，返回 true
    return true;
    }

}
