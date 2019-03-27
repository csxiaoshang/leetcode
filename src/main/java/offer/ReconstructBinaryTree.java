package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-25 下午3:51
 * <p>
 * 类说明：
 */
public class ReconstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        int preIndex=pre.length-1;
        int inIndex=in.length-1;
        return printTree(pre,0,preIndex,in,0,inIndex);
    }

    private TreeNode printTree(int[] pre, int i, int preIndex, int[] in, int i1, int inIndex) {
        if(i>preIndex||i1>inIndex)
            return null;
        TreeNode treeNode=new TreeNode(pre[i]);
        for (int num=i1;num<=inIndex;num++){
            if (in[num]==pre[i]){
                treeNode.left=printTree(pre,i+1,i+num-i1,in,i1,num-1);
                treeNode.right=printTree(pre,i+num-i1+1,preIndex,in,num+1,inIndex);
                break;
            }
        }
        return treeNode;
    }

    /**
     * Definition for binary tree
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public class  TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val =x;}
    }
}
