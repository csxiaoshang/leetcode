package main.java.offer;

import java.util.ArrayList;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-31 下午9:18
 * <p>
 * 类说明：
 */
public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        if (root!=null)
            arrayList.add(root.val);
        print(root,arrayList);
        return arrayList;
    }
    public void  print(TreeNode root,ArrayList<Integer> arrayList){
        if (root!=null)
        {
            if (root.left!=null)
            arrayList.add(root.left.val);
            if (root.right!=null)
                arrayList.add(root.right.val);
            print(root.left,arrayList);
            print(root.right,arrayList);
        }
    }
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}
