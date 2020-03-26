package main.java.offer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-27 下午11:23
 * <p>
 * 类说明：
 */
public class PrintZNode {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        LinkedList<TreeNode> first = new LinkedList<>();
        LinkedList<TreeNode> sec = new LinkedList<>();
        if (pRoot == null) {
            return res;
        }
        first.push(pRoot);
        while (!first.isEmpty() || !sec.isEmpty()) {
            ArrayList<Integer> tem1 = new ArrayList<>();
            ArrayList<Integer> tem2 = new ArrayList<>();
            TreeNode node;
            while (!first.isEmpty()) {
                node = first.pop();
                tem1.add(node.val);
                if (node.left != null) {
                    sec.push(node.left);
                }
                if (node.right != null) {
                    sec.push(node.right);
                }
            }
            if (tem1.size() > 0) {
                res.add(tem1);
            }
            while (!sec.isEmpty()) {
                node = sec.pop();
                tem2.add(node.val);
                if (node.right != null) {
                    first.push(node.right);
                }
                if (node.left != null) {
                    first.push(node.left);
                }
            }
            if (tem2.size() > 0) {
                res.add(tem2);
            }
        }
        return res;
    }
}
