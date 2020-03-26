package main.java.offer;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-27 下午10:29
 * <p>
 * 类说明：
 */
public class Symtrical {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot == null){
            return true;
        }
        return isSymmetrical(pRoot.left,pRoot.right);
    }
    boolean isSymmetrical(TreeNode left,TreeNode right){
        if(left==null && right == null){
            return true;
        }
        if(left==null || right == null){
            return false;
        }
        return left.val == right.val&&isSymmetrical(left.left,right.right)&&isSymmetrical(left.right,right.left);
    }
}
