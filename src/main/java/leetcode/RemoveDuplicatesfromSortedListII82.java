package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-20 上午11:54
 * <p>
 * 类说明：
 */
public class RemoveDuplicatesfromSortedListII82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = new ListNode(0);
        ListNode dummy = pre;
        pre.next = head;
        ListNode cur = head;
        while(cur!=null && cur.next!=null){
            boolean equal = false;
            //cur 和 cur.next 相等，cur 不停后移
            while(cur.next!=null && cur.val == cur.next.val){
                cur = cur.next;
                equal = true;
            }
            //发生了相等的情况
            // pre.next 直接指向 cur.next 删除所有重复数字
            if(equal){
                pre.next = cur.next;
                equal = false;
                //没有发生相等的情况
                //pre 移到 cur 的地方
            }else{
                pre = cur;
            }
            //cur 后移
            cur = cur.next;
        }
        return dummy.next;
    }

}
