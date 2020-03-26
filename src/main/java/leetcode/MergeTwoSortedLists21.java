package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-12-13 上午10:42
 * <p>
 * 类说明：
 */
public class MergeTwoSortedLists21 {
    /**
     * 解决链表问题 建议头结点不使用 空着，便于编程
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode res = head;
        while(l1 != null && l2 != null){
            head.next = l1.val <= l2.val?l1:l2;
            if(head.next == l1){
                l1=l1.next;
            }else{
                l2 = l2.next;
            }
            head = head.next;
        }
        head.next = l1== null ? l2 : l1;
        return res.next;
    }
}
