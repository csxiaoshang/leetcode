package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-28 上午11:15
 * <p>
 * 类说明：
 */
public class HasTree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result=false;
        if (root2!=null&&root1!=null){
            if (root2.val==root1.val)
                result=have(root1,root2);
            if (!result)
                result=HasSubtree(root1.left,root2);
            if (!result)
                result=HasSubtree(root1.right,root2);
        }
        return  result;

    }
    public  boolean have(TreeNode tree1,TreeNode tree2){
        if (tree1==null)
            return false;
        if (tree2==null)
            return true;
        if (tree1.val!=tree2.val)
            return false;
        return have(tree1.left,tree2.left)&&have(tree1.right,tree2.right);
    }
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
}
