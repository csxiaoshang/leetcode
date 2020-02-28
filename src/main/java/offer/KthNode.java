package main.java.offer;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-28 下午11:49
 * <p>
 * 类说明：
 */
public class KthNode {
    TreeNode res = null;
    int index =0;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot == null){
            return pRoot;
        }
        KthNode(pRoot.left,k);
        if(++index == k){
            res = pRoot;
        }
        KthNode(pRoot.right,k);
        return res;
    }
}
