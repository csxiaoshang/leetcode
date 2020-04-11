package main.java.leetcode;

import main.java.ListNode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-8 上午9:17
 * <p>
 * 类说明：
 */
public class SortList148 {
    public ListNode sortList(ListNode head) {
        return solution1(head);
    }

    /**
     * 递归归并
     * @param head
     * @return
     */
    private ListNode solution1(ListNode head) {
        return mergeSort(head);
    }

    private ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode r = head,l = head;
        ListNode pre = head;
        while (r != null && r.next != null) {
            pre = l;
            l = l.next;
            r = r.next.next;
        }
        if (head == l) {
            return null;
        }
        pre.next = null;
        ListNode h1 = mergeSort(head);
        ListNode h2 = mergeSort(l);
        return merge(h1, h2);
    }

    private ListNode merge(ListNode h1, ListNode h2) {
        ListNode res = new ListNode(-1);
        ListNode index = res;
        while (h1 != null & h2 != null) {
            if (h1.val < h2.val) {
                index.next = h1;
                h1 = h1.next;
            }else{
                index.next = h2;
                h2 = h2.next;
            }
            index = index.next;
        }
        if (h1 != null) {
            index.next = h1;
        }
        if (h2 != null) {
            index.next = h2;
        }
        return res.next;
    }
}
