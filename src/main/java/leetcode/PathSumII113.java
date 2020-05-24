package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-24 上午10:56
 * <p>
 * 类说明：
 */
public class PathSumII113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null || sum == 0) {
            return res;
        }
        trace(root,sum,new ArrayList<>(),res);
        return res;
    }
    private void trace (TreeNode node,int next,List<Integer> list,List<List<Integer>> res){
        if (next < 0) {
            return;
        }
        if (node.left == null && node.right == null && next == node.val) {
            list.add(node.val);
            res.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return;
        }
        if (node.left != null) {
            list.add(node.val);
            trace(node.left,next-node.val,list,res);
            list.remove(list.size()-1);
        }
        if (node.right != null) {
            list.add(node.val);
            trace(node.right, next - node.val, list, res);
            list.remove(list.size() - 1);
        }
    }
}
