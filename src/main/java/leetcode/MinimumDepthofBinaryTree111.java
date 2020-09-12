package main.java.leetcode;

import java.util.LinkedList;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-27 上午11:29
 * <p>
 * 类说明：
 */
public class MinimumDepthofBinaryTree111 {

    /**
     * dfs
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (left == 0 || right == 0) return left + right + 1;
        return Math.min(left, right) + 1;
    }

    /**
     * bfs
     * @param root
     * @return
     */
    public int minDepth1(TreeNode root) {

        if (root == null) {
            return 0;
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int res = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();

                if (cur.left == null && cur.right == null) {
                    return res;
                }
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
            res++;
        }
        return res;
    }

}
