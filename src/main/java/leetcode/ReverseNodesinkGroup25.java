package main.java.leetcode;



/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-27 上午10:57
 * <p>
 * 类说明：
 */
public class ReverseNodesinkGroup25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode res = new ListNode(-1);
        ListNode index = res;
        ListNode slow = head,fast = head;
        if (k == 1) {
            while (slow != null) {
                ListNode tem = slow.next;
                slow.next = res.next;
                res.next = slow;
                slow = tem;
            }
            return res.next;
        }
        while (fast.next != null) {
            int count = 0;
            while (fast.next != null) {
                fast = fast.next;
                count++;
                if (count >= k -1) {
                    break;
                }
            }
            fast = fast.next;
            if (count < k -1) {
                break;
            }
            ListNode cur = slow;
            while (count-->=0) {
                ListNode temp = slow.next;
                slow.next = index.next;
                index.next = slow;
                slow = temp;
            }
            index = cur;
            if (fast == null){
                break;
            }
        }
        index.next = slow;
        return res.next;
    }
}

