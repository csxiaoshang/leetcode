package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-3 上午9:05
 * <p>
 * 类说明：
 */
public class PalindromeLinkedList234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode slow = head,fast = head;
        ListNode pre = null;
        ListNode cur = null;
        while (fast != null && fast.next != null) {
            cur = slow;
            slow = slow.next;
            fast = fast.next.next;
            cur.next = pre;
            pre = cur;
        }
        if (fast != null) {
            slow = slow.next;
        }
        while (pre != null&&slow!=null) {
            if (pre.val != slow.val) {
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }
        return true;
    }
}
