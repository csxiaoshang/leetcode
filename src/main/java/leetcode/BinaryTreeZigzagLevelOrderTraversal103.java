package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-11 上午10:20
 * <p>
 * 类说明：
 */
public class BinaryTreeZigzagLevelOrderTraversal103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        TreeNode c=root;
        List<List<Integer>> ans =new ArrayList<List<Integer>>();
        if(c==null) return ans;
        Stack<TreeNode> s1=new Stack<TreeNode>();
        Stack<TreeNode> s2=new Stack<TreeNode>();
        s1.push(root);
        while(!s1.isEmpty()||!s2.isEmpty())
        {
            List<Integer> tmp=new ArrayList<Integer>();
            while(!s1.isEmpty())
            {
                c=s1.pop();
                tmp.add(c.val);
                if(c.left!=null) s2.push(c.left);
                if(c.right!=null) s2.push(c.right);
            }
            ans.add(tmp);
            tmp=new ArrayList<Integer>();
            while(!s2.isEmpty())
            {
                c=s2.pop();
                tmp.add(c.val);
                if(c.right!=null)s1.push(c.right);
                if(c.left!=null)s1.push(c.left);
            }
            if(!tmp.isEmpty()) ans.add(tmp);
        }
        return ans;
    }

}
