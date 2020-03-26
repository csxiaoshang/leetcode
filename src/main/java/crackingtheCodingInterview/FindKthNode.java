package main.java.crackingtheCodingInterview;

import java.util.Stack;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-6-15 下午6:59
 * <p>
 * 类说明：
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthNode {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

        public ListNode FindKthToTail(ListNode head,int k) {
            if (head==null||k<=0){
                return null;
            }
            ListNode left=head;
            ListNode right=head;
            for (int i=1;i<k;i++){
                if (right.next!=null){
                    right=right.next;
                }else {
                    return null;
                }
            }
            while(right.next!=null){
                left=left.next;
                right=right.next;
            }
            return left;
        }
}
