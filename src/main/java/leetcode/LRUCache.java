package main.java.leetcode;

import java.util.HashMap;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-22 上午10:38
 * <p>
 * 类说明：
 */
public class LRUCache{

    public static void main(String[] args) {
        LRUCache lru = new LRUCache(1);
        lru.put(2,1);
        System.out.println(lru.get(2));
        lru.put(3,2);
        System.out.println(lru.get(2));
        System.out.println(lru.get(3));
    }

    static class Node  {
        Integer key;
        Integer value;
        Node before,after;
        Node(Integer key,Integer value){
            this.key = key;
            this.value = value;
        }
    }
    Node head;
    Node tail;
    Integer capacity;
    HashMap<Integer, Node> map = new HashMap<>();
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }else {
            Node node = map.get(key);
            if (node != tail) {
                removeNode(node);
                addNode(node);
            }
            return node.value;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            removeNode(node);
            addNode(node);
        }else{
            Node node = new Node(key, value);
            if (map.size()==capacity) {
                map.remove(head.key);
                removeNode(head);
            }
            addNode(node);
            map.put(key, node);
        }
    }

    private void addNode(Node node) {
        if (tail == null){
            head = node;
            tail = node;
        }else {
            tail.after = node;
            node.before = tail;
            tail = node;
        }

    }

    private void removeNode(Node node) {
        if (node.before != null) {
            node.before.after = node.after;
        }else {
            head = head.after;
        }
        if (node.after != null) {
            node.after.before = node.before;
        }else {
            tail = node.before;
        }
        node.before = null;
        node.after = null;
    }
}
