package main.java.leetcode;

import java.util.PriorityQueue;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-28 上午11:18
 * <p>
 * 类说明：
 */
public class BinarySearchTreeIterator173 {

    PriorityQueue<Integer> queue = new PriorityQueue<>();

    public BinarySearchTreeIterator173(TreeNode root) {
        trace(root);
    }

    private void trace(TreeNode node) {
        if (node != null) {
            queue.offer(node.val);
        }else {
            return;
        }
        trace(node.left);
        trace(node.right);
    }

    /** @return the next smallest number */
    public int next() {
        return queue.poll();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
