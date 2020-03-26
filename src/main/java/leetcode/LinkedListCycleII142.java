package main.java;

import java.util.HashSet;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-5 上午10:09
 * <p>
 * 类说明：
 */
public class LinkedListCycleII142 {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        if(head == null){
            return head;
        }
        int index = 0;
        while(head != null){
            if(set.contains(head)){
                return head;
            }
            set.add(head);
            head = head.next;
        }
        return null;
    }
}
