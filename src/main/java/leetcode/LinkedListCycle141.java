package main.java.leetcode;

import java.util.HashSet;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-12-13 上午11:19
 * <p>
 * 类说明：
 */
public class LinkedListCycle141 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while(head != null){
            if(set.contains(head)){
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
