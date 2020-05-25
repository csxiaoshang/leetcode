package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-25 下午9:31
 * <p>
 * 类说明：
 */
public class SumRoottoLeafNumbers129 {
    int res = 0;
    public int sumNumbers(TreeNode root) {
         dfs(root,0);
         return res;
    }

    private void dfs(TreeNode node, int cur) {
        if (node == null) {
            return;
        }
        cur = cur * 10 + node.val;
        if (node.left != null) {
            dfs(node.left, cur);
        }
        if (node.right != null) {
            dfs(node.right, cur);
        }
        if (node.left == null && node.right == null) {
            res+=cur;
        }
    }

}
