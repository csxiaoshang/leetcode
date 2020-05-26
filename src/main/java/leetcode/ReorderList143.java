package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-26 下午5:39
 * <p>
 * 类说明：
 */
public class ReorderList143 {
    public static void main(String[] args) {
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);
        reorderList(node1);
    }
    public static void reorderList(ListNode head) {
        helper(head);
    }

    private static void helper(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        ListNode pre = head,cur = head;
        while (cur.next != null) {
            pre = cur;
            cur = cur.next;
        }
        cur.next = head.next;
        head.next = cur;
        pre.next = null;
        helper(cur.next);
    }
}
