package main.java.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-28 下午8:49
 * <p>
 * 类说明：
 */
public class BinarTreePreorderTraversal144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                res.add(root.val);
                stack.push(root);
                root = root.left;
            }else {
                    root = stack.pop();
                    root= root.right;
            }
        }
        return res;
    }

    /**
     * 第二种思路的话，我们还可以将左右子树分别压栈，然后每次从栈里取元素。
     * 需要注意的是，因为我们应该先访问左子树，而栈的话是先进后出，所以我们压栈先压右子树。
     * @param root
     * @return
     */
    public List<Integer> solution1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            if (cur == null) {
                continue;
            }
            list.add(cur.val);
            stack.push(cur.right);
            stack.push(cur.left);
        }
        return list;
    }

}
