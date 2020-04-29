package main.java.leetcode;


/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-29 上午9:25
 * <p>
 * 类说明：
 */
public class ConvertSoListtoBinarySearchTree109 {
    public TreeNode sortedListToBST(ListNode head) {
        return sortedArrayToBST(head, null);
    }

    private TreeNode sortedArrayToBST(ListNode head, ListNode tail) {
        if (head == tail) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }

        TreeNode root = new TreeNode(slow.val);
        root.left = sortedArrayToBST(head, slow);
        root.right = sortedArrayToBST(slow.next, tail);
        return root;
    }

}
