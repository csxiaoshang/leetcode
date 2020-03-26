package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-11 下午4:06
 * <p>
 * 类说明：
 */
public class OddEvenLinkedList328 {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode  index = head;
        ListNode inext = new ListNode(0);
        ListNode nindex = inext;
        while(index.next != null){
            nindex.next = index.next;
            nindex = nindex.next;
            index.next = index.next.next;
            if(index.next == null){
                break;
            }
            index = index.next;
        }
        nindex.next = null;
        if(index != null){
            index.next = inext.next;
        }
        return head;
    }
}
