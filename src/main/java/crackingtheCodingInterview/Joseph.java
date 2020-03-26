package main.java.crackingtheCodingInterview;

import java.util.LinkedList;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-11-6 下午8:00
 * <p>
 * 类说明：
 */
public class Joseph {
    public int getResult(int n, int m) {
        // write code here
        Node head = null;
        Node index = null;
        for (int i = 1; i <= n; i++) {
            Node node = new Node(i);
            if (i == 1) {
                head = node;
            }else {
                node.pre = index;
                index.next = node;
            }
            index = node;
        }
        index.next = head;
        head.pre = index;
        while (!index.next.equals(index)) {
            for (int i = 0; i < m; i++) {
                index=index.next;
                if (i == m - 1) {
                    index.pre.next=index.next;
                    index.next.pre=index.pre;
                }
            }
        }
        return index.item;
    }

    class  Node{
        int item;
        Node pre;
        Node next;

        Node(int i){
            this.item =i;
        }
    }
}
