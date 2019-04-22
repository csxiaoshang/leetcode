package main.java.offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-22 下午7:10
 * <p>
 * 类说明：
 */
public class TreeDepth {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public int TreeDepth(TreeNode root) {
        if (root==null)
            return 0;
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int depth=0,count=0,nextcount=1;
        while(!queue.isEmpty()){
            TreeNode top=queue.poll();
            if (top.left!=null)
                queue.add(top.left);
            if (top.right!=null)
                queue.add(top.right);
            count++;
            if (count==nextcount){
                nextcount=queue.size();
                depth++;
                count=0;
            }
        }
        return depth;
    }
}
