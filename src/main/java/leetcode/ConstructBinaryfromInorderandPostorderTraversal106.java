package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-2 下午10:24
 * <p>
 * 类说明：
 */
public class ConstructBinaryfromInorderandPostorderTraversal106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder== null || inorder.length == 0){
            return null;
        }
        int n = postorder.length ;
        return     build(inorder,0,n-1,postorder,0,n-1);
    }
    private TreeNode build(int[] inorder,int il,int ir, int[] postorder, int pl, int pr){

        if(il > ir || pl> pr){
            return null;
        }
        int index = 0;
        for(int i =il ;i<=ir;i++){
            if(postorder[pr] == inorder[i]){
                index = i;
                break;
            }
        }
        TreeNode node = new TreeNode(postorder[pr]);
        node.left = build(inorder,il,index-1,postorder,pl,pl+index-il-1);
        node.right = build(inorder,index+1,ir,postorder,pl+index-il,pr-1);
        return node;
    }
}
