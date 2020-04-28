package main.java.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-2 下午7:27
 * <p>
 * 类说明：
 */
public class BinaryTreeInorderTraversal94 {

    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 递归中序遍历
     */
    class Solution1 {
        List<Integer> res = new ArrayList<>();

        public List<Integer> inorderTraversal(TreeNode root) {
            if (root == null) {
                return res;
            }
            inorderTraversal(root.left);
            res.add(root.val);
            inorderTraversal(root.right);
            return res;
        }

    }

    /**
     * 使用stack 非递归版本的中序遍历
     */
    class Solution2 {
        List<Integer> res = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();

        public List<Integer> inorderTraversal(TreeNode root) {
            if (root == null) {
                return res;
            }
            TreeNode current = root;
            while (current != null || !stack.isEmpty()) {
                if (current == null) {
                    current = stack.pop();
                    res.add(current.val);
                    current = current.right;
                } else {
                    stack.push(current);
                    current = current.left;
                }
            }
            return res;
        }
    }
}
