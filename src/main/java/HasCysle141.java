package main.java;

import java.util.List;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-13 下午10:05
 * <p>
 * 类说明：
 */
public class HasCysle141 {
    public boolean hasCycle(ListNode head ){
        if(head == null) return false;
        ListNode l1 = head, l2 = head.next;
        while(l1 != null && l2 != null){
            if(l1 == l2) return true;
            l1 = l1.next;
            if(l2.next == null) break;
            l2 = l2.next.next;
        }
        return false;
    }

    }
      class ListNode {
     int val;
     ListNode next;
      ListNode(int x) {
         val = x;
          next = null;
      }
}
