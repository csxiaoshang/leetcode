package main.java.leetcode;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-13 下午12:07
 * <p>
 * 类说明：
 */
public class FlattenBinaryTreetoLinkedList114 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public void flatten(TreeNode root) {
        solution1(root);

    }

    private void solution1(TreeNode root) {
        while (root != null) {
            if (root.left == null) {
                root = root.right;
            }else{
                TreeNode pre = root.left;
                while (pre.right != null) {
                    pre = pre.right;
                }
                pre.right = root.right;
                root.right = root.left;
                root.left = null;
                root = root.right;
            }
        }
    }

}
