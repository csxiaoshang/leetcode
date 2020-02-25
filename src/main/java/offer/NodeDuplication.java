package main.java.offer;

import main.java.ListNode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-25 下午11:04
 * <p>
 * 类说明：
 */
public class NodeDuplication {

    public ListNode deleteDuplication1(ListNode pHead)
    {
        if(pHead == null){
            return null;
        }
        ListNode res = new ListNode(0);
        res.next = pHead;
        ListNode last = res;
        while(pHead != null&&pHead.next!=null){
            ListNode next = pHead.next;
            if(pHead.val == next.val){
                while(pHead!=null&&pHead.val == next.val){
                    pHead = pHead.next;

                }
                last.next = pHead;
            }else{
                last = pHead;
                pHead = pHead.next;
            }
        }
        return res.next;
    }

}
