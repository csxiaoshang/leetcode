package main.java.crackingtheCodingInterview;

import java.util.List;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-6-18 下午10:44
 * <p>
 * 类说明：
 * 有两个用链表表示的整数，每个结点包含一个数位。这些数位是反向存放的，也就是个位排在链表的首部。编写函数对这两个整数求和，并用链表形式返回结果。
 */
public class Plus {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        }
        ListNode aHead=a;
        ListNode bHead=b;
        ListNode aIndex=a;
        ListNode bIndex=b;
        int tem = 0;
        while (a != null) {
            int sum = a.val + b.val + tem;
            a.val = sum % 10;
            b.val = sum % 10;
            tem = sum / 10;
            aIndex=a;
            bIndex=b;
            b = b.next;
            a = a.next;
            if (b == null&&a!=null) {
                if (tem!=0){
                    a.val+=tem;
                    return aHead;
                }
                return aHead;
            }
        }
        if (tem!=0){
            if (b!=null){
                bIndex.next=new ListNode(tem+b.val);
            }
            else {
                bIndex.next=new ListNode(tem);
            }
        }
        return bHead;
    }
}
