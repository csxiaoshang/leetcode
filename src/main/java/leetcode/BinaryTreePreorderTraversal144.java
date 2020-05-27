package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-26 下午6:18
 * <p>
 * 类说明：
 */
public class BinaryTreePreorderTraversal144 {
    List<Integer> res = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        return solution1(root);
    }

    /**
     * recursive
     * @param root
     * @return
     */
    private List<Integer> solution1(TreeNode root) {
        dfs(root);
        return res;
    }

    private List<Integer> solution2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                res.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop().right;
        }
        return res;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        res.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }
}
