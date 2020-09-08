package main.java.offer.tencent;

import java.util.*;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-9-6 下午8:39
 * <p>
 * 类说明：
 */
public class Solution8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String tem = in.next();
            map.put(tem, map.getOrDefault(tem,0) + 1);
        }
        PriorityQueue<Node> min = new PriorityQueue<>(k,new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.value.equals(o2.value)) {
                    return o1.key.compareTo(o2.key);
                }
                return o1.value - o2.value;
            }
        });

        PriorityQueue<Node> max = new PriorityQueue<>(k,new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.value.equals(o2.value)) {
                    return o1.key.compareTo(o2.key);
                }
                return o2.value - o1.value;
            }
        });

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            Node node = new Node(entry.getKey(), entry.getValue());
            min.offer(node);
            max.offer(node);
        }

        for (int i = 0; i < k; i++) {
            Node node = max.poll();
            System.out.println(node.key+" "+node.value);
        }
        for (int i = 0; i < k; i++) {
            Node node = min.poll();
            System.out.println(node.key+" "+node.value);
        }
    }

}
class Node{
    String key;
    Integer value;

    public Node(String key, Integer value) {
        this.key = key;
        this.value = value;
    }
    public Integer getValue(){
        return this.value;
    }
}
