package main.java;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-3 下午5:15
 * <p>
 * 类说明：
 */
public class PopulatingNextRightPointersinEachNodeII117 {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }
        Queue<Node> quene = new LinkedList<>();
        quene.add(root);
        while(!quene.isEmpty()){
            int length = quene.size();
            for(int i =0 ;i<length;i++){
                Node index = quene.poll();
                index.next = i == length -1 ? null:quene.peek();
                if(index.left != null){
                    quene.add(index.left);
                }
                if(index.right != null){
                    quene.add(index.right);
                }
            }
        }
        return root;
    }
}
