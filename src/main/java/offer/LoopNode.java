package main.java.offer;

import main.java.ListNode;

import java.util.HashSet;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-25 下午8:32
 * <p>
 * 类说明：
 */
public class LoopNode {
    /**
     * 使用ｓｅｔ
     *
     * @param pHead
     * @return
     */
    public ListNode EntryNodeOfLoop1(ListNode pHead) {
        HashSet<ListNode> nodes = new HashSet<>();
        if (pHead == null) {
            return null;
        }
        while (pHead != null) {
            if (nodes.contains(pHead)) {
                return pHead;
            } else {
                nodes.add(pHead);
                pHead = pHead.next;
            }
        }
        return null;
    }

    /**
     * 双指针解法
     *
     * @param pHead
     * @return
     */
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        fast = pHead;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
