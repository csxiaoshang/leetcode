package main.java.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

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

    /**
    *@Description: do it myself
    *@param: root
    *@return: java.util.List<java.lang.Integer>
    *@Author: ashang
    *@date: 20-5-27上午8:59
    */
    private List<Integer> solution2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = root;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
             TreeNode temp = stack.peek();
            if (temp.right != null && temp.right != pre) {
                root = temp.right;
            }else {
                res.add(temp.val);
                pre = temp;
                stack.pop();
            }
        }
        return res;
    }
}
