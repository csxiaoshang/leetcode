package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-9-8 下午5:14
 * <p>
 * 类说明：
 * Two elements of a binary search tree (BST) are swapped by mistake.
 *
 * Recover the tree without changing its structure.
 *
 * Example 1:
 *
 * Input: [1,3,null,null,2]
 *
 *    1
 *   /
 *  3
 *   \
 *    2
 *
 * Output: [3,1,null,null,2]
 *
 *    3
 *   /
 *  1
 *   \
 *    2
 * Example 2:
 *
 * Input: [3,1,4,null,null,2]
 *
 *   3
 *  / \
 * 1   4
 *    /
 *   2
 *
 * Output: [2,1,4,null,null,3]
 *
 *   2
 *  / \
 * 1   4
 *    /
 *   3
 * Follow up:
 *
 * A solution using O(n) space is pretty straight forward.
 * Could you devise a constant space solution?
 */
public class RecoverBinarySearchTree99 {

    TreeNode pre = new TreeNode(Integer.MIN_VALUE);
    TreeNode first = null, second = null;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(3);
        root.left = left;
        TreeNode right = new TreeNode(2);
        left.right = right;
        RecoverBinarySearchTree99 solution = new RecoverBinarySearchTree99();
        solution.recoverTree(root);
    }
    public void recoverTree(TreeNode root) {

        traverse(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void traverse(TreeNode node) {
        if (node == null) {
            return;
        }
        traverse(node.left);

        if (pre.val > node.val) {
            first = first == null ? pre : first;
            second = node;
        }
        pre = node;
        traverse(node.right);
    }
}
