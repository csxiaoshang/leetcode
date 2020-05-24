package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-24 下午3:00
 * <p>
 * 类说明：
 */
public class PopulatingNextRightPointersinEachNode116 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Node pre = root;
        Node cur = null;
        Node start = root;
        while (pre.left != null) {
            if (cur == null) {
                pre.left.next = pre.right;
                pre = start.left;
                cur = start.right;
                start = pre;
            }else {
                pre.left.next = pre.right;
                pre.right.next = cur.left;
                pre = cur;
                cur = cur.next;
            }
        }
        return root;
    }

}
