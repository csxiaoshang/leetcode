package main.java.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 北集
 * @Date 2020/8/9 11:11
 * @Description:
 */
public class LRUCache1<K,V> {

    public static void main(String[] args) {
        LRUCache1 lru = new LRUCache1(2);
        lru.put(2,2);
        System.out.println(lru.get(2));
        lru.put(3,3);
        System.out.println(lru.get(2));
        System.out.println(lru.get(3));
        lru.put(4,4);
        System.out.println(lru.get(4));
        System.out.println(lru.map);
    }

    public Map<K, Node> map = new HashMap<>();
    Integer capacity;
    Node head;
    Node tail;

    public LRUCache1(Integer capacity) {
        this.capacity = capacity;
    }
    class Node<K,V>{
        K key;
        V value;
        Node pre;
        Node next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public V get(K key) {
        if (!map.containsKey(key)) {
            return null;
        }else{
            Node node = map.get(key);
            if (node != tail) {
                removeNode(node);
                addNode(node);
            }
            return (V)node.value;
        }
    }

    public void put(K key, V value) {
        Node node = new Node(key, value);
        if (map.containsKey(key)) {
            node = map.get(key);
            removeNode(node);
            addNode(node);
            map.put(key, node);
        }else{
            if (map.size() == capacity) {
                map.remove(head.key);
                removeNode(head);
            }
            map.put(key, node);
            addNode(node);
        }
    }

    private void removeNode(Node node) {
        Node pre = node.pre;
        Node next = node.next;
        if (node == head) {
            head = node.next;
        }
        if (node == tail) {
            tail = node.pre;
        }
        if (pre != null) {
            pre.next = next;
        }
        if (next != null) {
            next.pre = pre;
        }
        node.pre = null;
        node.next = null;
    }

    private void addNode(Node node){
        if (tail == null) {
            head = node;
        }else{
            tail.next = node;
        }
        tail = node;
    }
}
