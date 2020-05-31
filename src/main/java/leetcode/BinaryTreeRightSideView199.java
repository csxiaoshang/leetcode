package main.java.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-31 上午11:44
 * <p>
 * 类说明：
 */
public class BinaryTreeRightSideView199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            int len = queue.size();
            TreeNode cur = null;
            for (int i = 0; i < len; i++) {
                cur = queue.poll();
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            res.add(cur.val);
        }
        return res;
    }
}
