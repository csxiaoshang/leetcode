package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-22 下午11:46
 * <p>
 * 类说明：
 */
public class RemoveNthNodeFromEndofList19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode index = node;
        ListNode res =node;
        while(head!= null){
            if(n-->0){
                head = head.next;
            }else{
                index = index.next;
                head = head.next;
            }
        }
        index.next = index.next.next;
        return res.next;
    }
}
