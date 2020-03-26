package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-12-21 下午4:28
 * <p>
 * 类说明：
 */
public class ConvertSortedArraytoBinarySearchTree108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode res = getTree(nums, 0, nums.length - 1);
        return res;
    }

    public TreeNode getTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (right + left) / 2;
        TreeNode midNode = new TreeNode(nums[mid]);
        midNode.left = getTree(nums, left, mid - 1);
        midNode.right = getTree(nums, mid + 1, right);
        return midNode;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
