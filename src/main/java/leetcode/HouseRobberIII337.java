package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-28 上午8:37
 * <p>
 * 类说明：
 */
public class HouseRobberIII337 {
    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int val = root.val;
        if (root.left != null) {
            val += rob(root.left.left) + rob(root.left.right);
        }
        if (root.right != null) {
            val += rob(root.right.left) + rob(root.right.right);
        }
        int tem = rob(root.left) + rob(root.right);
        return Math.max(tem, val);
    }
}
