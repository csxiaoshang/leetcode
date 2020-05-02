package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-17 下午8:23
 * <p>
 * 类说明：
 */
public class MergekSortedLists23 {
    ListNode res = new ListNode(-1);
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0|| lists == null){
            return res.next;
        }
        int interval = 1;
        while(interval < lists.length){
            for(int i =0;i+interval<lists.length;i=i+interval*2){
                lists[i] = merge(lists[i],lists[i+interval]);
            }
            interval*=2;
        }
        return lists[0];
    }
    public ListNode merge(ListNode l ,ListNode r){
        ListNode head = new ListNode(-1);
        ListNode ans = head;
        while(l!=null && r!=null){
            if(l.val<r.val){
                head.next=l;
                l = l.next;
            }else{
                head.next = r;
                r= r.next;
            }
            head = head.next;
        }
        if(l == null){
            head.next = r;
        }
        if(r == null){
            head.next = l;
        }
        return ans.next;
    }
}
