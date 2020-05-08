package main.java.leetcode;

import java.util.Stack;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-8 下午1:13
 * <p>
 * 类说明：
 */
public class KthSmallestElementinaBST230 {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        int index = 0;
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            }else {
                if (index == k) {
                    return stack.peek().val;
                }
                index++;
                stack.pop();
                root = root.right;
            }
        }
        return 0;
    }

}
