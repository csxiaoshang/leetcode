package main.java.offer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-27 下午11:37
 * <p>
 * 类说明：
 */
public class LevelOrder {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        LinkedList<TreeNode> quene = new LinkedList<>();
        quene.add(pRoot);
        if(pRoot == null){
            return res;
        }
        TreeNode node = null;
        while(!quene.isEmpty()){
            int length = quene.size();
            ArrayList<Integer> tem = new ArrayList<>();
            for(int i=0;i<length;i++){
                node = quene.remove();
                tem.add(node.val);
                if(node.left!=null){
                    quene.add(node.left);
                }
                if(node.right != null){
                    quene.add(node.right);
                }
            }
            res.add(tem);
        }
        return res;
    }
}
