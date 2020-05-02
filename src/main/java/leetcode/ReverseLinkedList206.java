package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-2 下午7:09
 * <p>
 * 类说明：
 */
public class ReverseLinkedList206 {
    ListNode res = null;
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        recursive(head);
        return res;
    }

    private ListNode recursive(ListNode node) {
        if (node.next == null) {
            res = node;
            return node;
        }
        ListNode pre = recursive(node.next);
        pre.next = node;
        node.next = null;
        return node;
    }

    private ListNode iterative(ListNode head) {
        ListNode cur = null;
        ListNode res = new ListNode(-1);
        while (head != null) {
            ListNode temp = res.next;
            res.next = head;
            cur = head.next;
            head.next = temp;
            head = cur;
        }
        return res.next;
    }
}
