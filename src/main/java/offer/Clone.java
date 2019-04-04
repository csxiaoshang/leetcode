package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-4 下午3:06
 * <p>
 * 类说明：
 */
public class Clone {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if (pHead==null) return null;
        RandomListNode cHead = null,index,head;
        index=pHead;
        while(index!=null){
            RandomListNode tem = new RandomListNode(index.label);
            tem.next=index.next;
            index.next=tem;
            index=tem.next;
        }
        index=pHead;
        while(index!=null){
            index.next.random=index.random==null?null:index.random.next;
            index=index.next.next;
        }
        RandomListNode num=null;
        index=pHead;
        head=pHead.next;
        while(index!=null){
            num=index.next;
            index.next=num.next;
            num.next=num.next==null?null:num.next.next;
            index=index.next;
        }
        return head;
    }
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
}
