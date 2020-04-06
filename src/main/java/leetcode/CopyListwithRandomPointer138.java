package main.java.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-5 下午6:12
 * <p>
 * 类说明：
 */
public class CopyListwithRandomPointer138 {
    public Node copyRandomList(Node head) {
        return solution1(head);
    }

    /**
     * 时间复杂度o(2n)
     *
     * @param head
     * @return
     */
    private Node solution1(Node head) {
        if (head == null) {
            return null;
        }
        Map<Node, Node> map = new HashMap<>();
        Node h = head;
        while (h != null) {
            Node tem = new Node(h.val);
            map.put(h, tem);
            h = h.next;
        }
        h = head;
        while (h != null) {
            if (h.next != null) {
                map.get(h).next = map.get(h.next);
            }
            if (h.random != null) {
                map.get(h).random = map.get(h.random);
            }
            h = h.next;
        }
        return map.get(head);
    }

    /**
     * 时间复杂度o(n)
     *
     * @param head
     * @return
     */
    private Node solution2(Node head) {
        if (head == null) {
            return null;
        }
        Map<Node, Node> map = new HashMap<>();
        Node cur = new Node(-1);
        Node h = head;
        while (h != null) {
            if (!map.containsKey(h)) {
                Node tem = new Node(h.val);
                map.put(h, tem);
            }
            if (h.random != null) {
                if (!map.containsKey(h.random)) {
                    Node random = new Node(h.random.val);
                    map.put(h.random, random);
                }
                map.get(h).random = map.get(h.random);
            }
            cur.next = map.get(h);
            cur = map.get(h);
            h = h.next;
        }
        return map.get(head);
    }

    /**
     * 空间复杂度　o(1)
     * @param head
     * @return
     */
    private Node solution3(Node head){
        if (head == null) {
            return null;
        }
        Node h = head;
        while (h != null) {
            Node tem = new Node(h.val);
            tem.next = h.next;
            h.next = tem;
            h = h.next.next;
        }
        h = head;
        while (h != null) {
            if (h.random != null) {
                h.next.random = h.random.next;
            }
            h = h.next.next;
        }
        h = head;
        Node res =  h.next;
        Node l = null;
        while (h != null) {
            l = h.next;
            h.next = l.next;
            if (l.next != null) {
                l.next = l.next.next;
            }
            h = h.next;
        }
        return res;
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
