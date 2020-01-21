package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-1-19 下午8:55
 * <p>
 * 类说明：
 */
public class SwapNodesinPairs24 {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode pre = head;
        while(current!=null && current.next!=null){
            ListNode tem = current.next;
            if(current == head){
                current.next = current.next.next;
                tem.next = current;
                head = tem;
            }else{
                pre.next = current.next;
                current.next = current.next.next;
                tem.next = current;
            }
            pre = current;
            current = current.next;
        }
        return head;
    }

      public class ListNode {
          int val;
          ListNode next;
         ListNode(int x) { val = x; }
      }
}
