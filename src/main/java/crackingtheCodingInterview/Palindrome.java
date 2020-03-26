package main.java.crackingtheCodingInterview;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-6-19 下午10:20
 * <p>
 * 类说明：
 * 请编写一个函数，检查链表是否为回文。
 */
public class Palindrome {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public boolean isPalindrome(ListNode pHead) {
        // write code here
        ListNode p=pHead;
        ListNode res=null;
        while (p!=null){
            ListNode tem=new ListNode(p.val);
            tem.next=res;
            res=tem;
            p=p.next;
        }
        while(pHead!=null){
            if (pHead.val!=res.val){
                return false;
            }
            pHead=pHead.next;
            res=res.next;
        }
        return true;
    }
}
