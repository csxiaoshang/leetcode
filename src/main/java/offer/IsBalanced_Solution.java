package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-22 下午7:30
 * <p>
 * 类说明：
 */
public class IsBalanced_Solution {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public boolean IsBalanced_Solution(TreeNode root) {
        return getDepth(root)!=-1;
    }
    public int getDepth(TreeNode root){
        if (root==null)
            return 0;
        int left=getDepth(root.left);
        if (left==-1)
            return -1;
        int right=getDepth(root.right);
        if (right==-1)
            return -1;
        return Math.abs(right-left)>1?-1:Math.max(left,right)+1;
    }
}
