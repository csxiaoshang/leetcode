package main.java.leetcode;

import java.util.LinkedList;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-6-8 下午2:49
 * <p>
 * 类说明：
 */
public class SerializeandDeserializeBinaryTree297 {
    class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) {
                return "#";
            }
            StringBuilder sb = new StringBuilder();
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            sb.append(root.val);
            while (!queue.isEmpty()) {
                TreeNode cur = queue.poll();
                if (cur.left != null) {
                    queue.offer(cur.left);
                    sb.append("," + cur.left.val);
                }else {
                    sb.append(",#");
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                    sb.append(","+cur.right.val);
                }else {
                    sb.append(",#");
                }
            }
            return sb.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if ("#".equals(data)) {
                return null;
            }
            String[] str = data.split(",");
            TreeNode root = new TreeNode(Integer.valueOf(str[0]));
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int index = 1;
            int tem = 2;
            while (index < str.length) {
                TreeNode cur = queue.poll();
                if (!str[index].equals("#")){
                    cur.left = new TreeNode(Integer.valueOf(str[index++]));
                    queue.offer(cur.left);
                }else {
                    index++;
                }
                if (!str[index].equals("#")){
                    cur.right = new TreeNode(Integer.valueOf(str[index++]));
                    queue.offer(cur.right);
                }else{
                    index++;
                }
            }
            return root;
        }
    }
}
