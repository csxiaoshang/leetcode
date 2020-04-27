package main.java.leetcode;

import sun.reflect.generics.tree.Tree;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-27 上午11:34
 * <p>
 * 类说明：
 */
public class SumofLeftLeaves404 {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getSum(root.left,root) + getSum(root.right, root);
    }

    private int getSum(TreeNode node, TreeNode parent) {
       if (node == null) {
           return 0;
       }
        if (node.left == null && node.right == null) {
            if (node == parent.left){
                return node.val;
            }else {
                return 0;
            }
        }
        int left = getSum(node.left, node);
        int right = getSum(node.right, node);
        return left+right;
    }
}
