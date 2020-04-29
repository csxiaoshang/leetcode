package main.java.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-28 下午9:49
 * <p>
 * 类说明：
 */
public class BinaryTreePostorderTraversal145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        return solution1(root);
    }

    private List<Integer> solution1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode last = null;
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                TreeNode temp = stack.peek();
                if (temp.right != null && temp.right != last) {
                    cur = temp.right;
                } else {
                    res.add(temp.val);
                    last = temp;
                    stack.pop();
                }
            }
        }
        return res;
    }
}
