package main.java.offer;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-28 下午11:37
 * <p>
 * 类说明：
 */
public class SerializeTree {
    StringBuilder sb = new StringBuilder();
    int index = -1;
    String Serialize(TreeNode root) {
        if(root == null){
            return "#,";
        }
        preOrder(root);
        return sb.toString();
    }
    private void preOrder(TreeNode node){
        if(node == null){
            sb.append("#,");
            return;
        }
        sb.append(node.val+",");
        preOrder(node.left);
        preOrder(node.right);
    }
    TreeNode Deserialize(String str) {
        index++;
        if(index>=str.length()){
            return null;
        }
        String[] strr = str.split(",");
        TreeNode  node = null;
        if(!strr[index].equals("#")){
            node = new TreeNode(Integer.valueOf(strr[index]));
            node.left = Deserialize(str);
            node.right =Deserialize(str);
        }
        return node;
    }
}
