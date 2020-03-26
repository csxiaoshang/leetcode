package main.java.crackingtheCodingInterview;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-6-16 下午4:46
 * <p>
 * 类说明：
 * 实现一个算法，删除单向链表中间的某个结点，假定你只能访问该结点。
 */
public class Remove {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public boolean removeNode(ListNode pNode) {
        // write code here
        if(pNode.next==null||pNode==null){
            return false;
        }
        ListNode temp;
        temp=pNode.next;
        pNode.val=temp.val;
        pNode.next=temp.next;
        return true;
    }
}
