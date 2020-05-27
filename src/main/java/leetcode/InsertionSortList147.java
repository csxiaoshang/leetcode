package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-27 上午9:51
 * <p>
 * 类说明：
 */
public class InsertionSortList147 {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        //拿出的节点
        while (head != null) {
            ListNode tempH = dummy;
            ListNode headNext = head.next;
            head.next = null;
            while (tempH.next != null) {
                //找到大于要插入的节点的位置
                if (tempH.next.val > head.val) {
                    head.next = tempH.next;
                    tempH.next = head;
                    break;
                }
                tempH = tempH.next;
            }
            //没有执行插入，将当前节点加到末尾
            if (tempH.next == null) {
                tempH.next = head;
            }
            head = headNext;
        }
        return dummy.next;
    }

}
