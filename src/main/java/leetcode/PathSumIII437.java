package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-27 上午10:44
 * <p>
 * 类说明：
 */
public class PathSumIII437 {
    int count = 0;
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int tem = trace(root, sum, 0);
        count+=tem;
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return count;
    }

    private int trace(TreeNode node, int sum, int tem) {
        if (node == null) {
            return 0;
        }
        tem+=node.val;
        int num =0;
        if (tem == sum) {
            num++;
        }
        int left = trace(node.left, sum, tem);
        int right = trace(node.right, sum, tem);
        return left+right+num;
    }
}
