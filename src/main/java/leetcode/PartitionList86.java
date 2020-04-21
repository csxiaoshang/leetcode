package main.java.leetcode;

import main.java.ListNode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-21 上午8:21
 * <p>
 * 类说明：
 */
public class PartitionList86 {
    public ListNode partition(ListNode head, int x) {
        return soluiton1(head, x);
    }

    private ListNode soluiton1(ListNode head, int x) {
        ListNode less = new ListNode(-1);
        ListNode greater = new ListNode(-1);
        if (head == null){
            return head;
        }
        ListNode l = less,g = greater;
        while (head != null) {
            if (head.val < x) {
                l.next = head;
                l = l.next;
            }else {
                g.next = head;
                g = g.next;
            }
            ListNode cur = head;
            head = head.next;
            cur.next = null;
        }
        l.next = greater.next;
        return less.next;
    }
}
