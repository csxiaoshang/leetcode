package main.java.leetcode;


/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-22 上午10:13
 * <p>
 * 类说明：
 */
public class SameTree100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if (p == null && q == null) {
            return true;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
