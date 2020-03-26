package main.java.crackingtheCodingInterview;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-6-16 下午5:01
 * <p>
 * 类说明：
 * 编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
 */
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if (pHead==null){
            return  null;
        }
        ListNode small=new ListNode(-1);
        ListNode large=new ListNode(-1);
        ListNode sHead=small;
        ListNode lHead=large;
        while(pHead!=null){
            if (pHead.val<x){
                small.next=new ListNode(pHead.val);
                small=small.next;
            }else {
                large.next=new ListNode(pHead.val);
                large=large.next;
            }
            pHead=pHead.next;
        }
        small=sHead;
        while(small.next!=null&&small.next.val!=-1){
            small=small.next;
        }
        small.next=lHead.next;
        return sHead.next;
    }
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
