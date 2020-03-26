package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-21 上午10:53
 * <p>
 * 类说明：
 */
public class FindFirstCommonNode {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
         int lenth1=0,lenth2=0;
         ListNode p1=pHead1;
         ListNode p2=pHead2;
         while(p1!=null){
         lenth1++;
         p1=p1.next;
         }
         while (p2!=null){
             lenth2++;
             p2=p2.next;
         }
         int tem=lenth1>lenth2?lenth1-lenth2:lenth2-lenth1;
         if (lenth1>lenth2){
             while(tem>0){
                 pHead1=pHead1.next;
                 tem--;
             }
         }else {
             while(tem>0){
                 pHead2=pHead2.next;
                 tem--;
             }
         }
         while(pHead1!=pHead2){
             pHead1=pHead1.next;
             pHead2=pHead2.next;
         }
         return pHead1;
    }
    }
}
