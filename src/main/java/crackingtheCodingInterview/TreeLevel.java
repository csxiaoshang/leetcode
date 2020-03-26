package main.java.crackingtheCodingInterview;

import java.util.LinkedList;

public class TreeLevel {
    public ListNode getTreeLevel(TreeNode root, int dep) {
        // write code here
        int lenth=1;
        LinkedList<TreeNode> linkedList=new LinkedList<>();
        ListNode head=null;
        if (root == null)
            return head;
        linkedList.add(root);
        while(dep>1&&!linkedList.isEmpty()){
            int len=linkedList.size();
            for (int i=0;i<len;i++){
                TreeNode node=linkedList.poll();
                if (node.left!=null){
                    linkedList.add(node.left);
                }
                if (node.right != null) {
                    linkedList.add(node.right);
                }
            }
            dep--;
        }
        head=new ListNode(linkedList.poll().val);
        ListNode tem=head;
        while (!linkedList.isEmpty()){
            tem.next=new ListNode(linkedList.poll().val);
            tem=tem.next;
        }
        return head;
    }
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
}
