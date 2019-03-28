package main.java.offer;

import java.util.List;
import java.util.Stack;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-28 上午10:04
 * <p>
 * 类说明：
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        Stack<ListNode> stack=new Stack<>();
        if (head==null)
            return null;
        while(head!=null){
            stack.push(head);
            head=head.next;
        }
        ListNode res=stack.peek();
        while (!stack.isEmpty()){
            ListNode listNode= stack.pop();
            if (stack.isEmpty())
                listNode.next=null;
            else listNode.next=stack.peek();
        }
        return res;
    }
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
}
