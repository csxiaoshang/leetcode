package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-28 上午10:42
 * <p>
 * 类说明：
 */
public class Merge {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode listNode = null;
        ListNode head=null;
        if (list1==null)
            return list2;
        if (list2==null)
            return list1;
        while (list1!=null&&list2!=null){
            if (list1.val<=list2.val){
                if (head==null)
                    head=listNode=list1;
                else {
                    listNode.next=list1;
                    listNode=listNode.next;
                }
                list1=list1.next;
            }else {
                if (head==null)
                    head=listNode=list2;
                else {
                    listNode.next=list2;
                    listNode=listNode.next;
                }
                list2=list2.next;
            }
        }
        if (list1==null)
            listNode.next=list2;
        else
            listNode.next=list1;
        return head;
    }
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
}
