package main.java.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-25 下午10:04
 * <p>
 * 类说明：
 */
public class UniqueBinarySearchTreesII95 {
    public List<TreeNode> generateTrees(int n) {
        return solution1(n);
    }
    private List<TreeNode> solution1(int n){
        List<TreeNode> res = new LinkedList<>();
        if (n == 0){
            return res;
        }
        return getTree(1, n);
    }
    private List<TreeNode> getTree(int s,int e){
        LinkedList<TreeNode> res = new LinkedList<>();
        if(s>e){
            res.add(null);
        }
        if(s == e){
            res.add(new TreeNode(s));
            return res;
        }
        for (int i = s;i<=e;i++){
            List<TreeNode> lefts= getTree(s,i-1);
            List<TreeNode> rights = getTree(i + 1, e);
            for (TreeNode left : lefts) {
                for (TreeNode right : rights) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;
    }
}
