package main.java.leetcode;


/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-16 上午9:42
 * <p>
 * 类说明：
 */
public class RotateList61 {
    public static void main(String[] args) {

    }


    public ListNode rotateRight(ListNode head, int k) {
        return solution2(head, k);
    }
    /**
     * 一个一个移动　time limit exceed
     * @param head
     * @param k
     * @return
     */
    private ListNode solution1(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode res = new ListNode(-1);
        res.next = head;
        while (k-- > 0) {
            ListNode pre = head,cur = head;
            while (cur.next != null) {
                pre = cur;
                cur = cur.next;
            }
            cur.next = res.next;
            res.next = cur;
            pre.next = null;
            head = res.next;
        }
        return res.next;
    }

    /**
     * 整体移动节点
     * @param head
     * @param k
     * @return
     */
    private ListNode solution2(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (k == 0) {
            return head;
        }
        int len = 1;
        ListNode tail  =head;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        int n = k%len;
        ListNode pre = head;
        for (int i = 0; i < len-1 - n; i++) {
            pre = pre.next;
        }
        tail.next = head;
        head = pre.next;
        pre.next = null;
        return head;
    }
}
