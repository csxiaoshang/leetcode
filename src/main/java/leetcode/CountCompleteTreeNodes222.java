package main.java.leetcode;

import java.util.LinkedList;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-9-8 下午4:26
 * <p>
 * 类说明：
 * Given a complete binary tree, count the number of nodes.
 * <p>
 * Note:
 * <p>
 * Definition of a complete binary tree from Wikipedia:
 * In a complete binary tree every level, except possibly the last, is completely filled,
 * and all nodes in the last level are as far left as possible.
 * It can have between 1 and 2h nodes inclusive at the last level h.
 * <p>
 * Example:
 * <p>
 * Input:
 * 1
 * / \
 * 2   3
 * / \  /
 * 4  5 6
 * <p>
 * Output: 6
 */
public class CountCompleteTreeNodes222 {
    public int countNodes(TreeNode root) {

        if (root == null) {
            return 0;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        int res = 0;
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            res++;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return res;
    }
}
