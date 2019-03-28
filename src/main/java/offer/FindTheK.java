package main.java.offer;

import java.util.Stack;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-28 上午9:44
 * <p>
 * 类说明：
 */
public class FindTheK {
    public ListNode FindKthToTail(ListNode head,int k) {
        Stack<ListNode> stack=new Stack<>();
        while(head!=null){
            stack.push(head);
            head=head.next;
        }
        while(k-->1){
            if (stack.isEmpty())
                stack.pop();
            else
                return head;
        }
        return stack.isEmpty()?null: stack.pop();
    }
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
}
