package main.java.leetcode;



/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-20 下午12:26
 * <p>
 * 类说明：
 */
public class RemDuplicatesfromSortedList83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = new ListNode(-1);
        if (head == null || head.next == null) {
            return head;
        }
        res.next = head;
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next =cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return res.next;
    }
}
