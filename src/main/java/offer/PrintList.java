package main.java.offer;


import java.util.ArrayList;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-25 下午3:39
 * <p>
 * 类说明：
 */
public class PrintList {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        if(listNode==null)
            return arrayList;
        while (listNode!=null){
            arrayList.add(listNode.val);
            listNode=listNode.next;
        }
        return arrayList;

    }

         public class ListNode {
            int val;
             ListNode next = null;

            ListNode(int val) {
                 this.val = val;
            }
        }

}


//////递归


        ArrayList<Integer> arrayList=new ArrayList<Integer>();
public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode!=null){
        this.printListFromTailToHead(listNode.next);
        arrayList.add(listNode.val);
        }
        return arrayList;
        }
