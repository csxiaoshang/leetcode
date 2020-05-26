package main.java.leetcode;

import java.util.*;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-26 上午9:56
 * <p>
 * 类说明：
 */
public class CloneGraph133 {
    private class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Map<Integer, Node> map = new HashMap<>();
        Map<Integer, Boolean> visited = new HashMap<>();
        Node res = new Node(node.val);
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(node);
        map.put(node.val, res);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            if (visited.getOrDefault(cur.val,false)) {
                continue;
            }
            List<Node> curNeightbors = map.get(cur.val).neighbors;
            for (Node n : cur.neighbors) {
                if (!map.containsKey(n.val)) {
                    map.put(n.val, new Node(n.val));
                }
                if (!visited.getOrDefault(n.val, false)) {
                    queue.offer(n);
                }
                curNeightbors.add(map.get(n.val));
            }
            visited.put(cur.val, true);
        }
        return res;
    }
}
