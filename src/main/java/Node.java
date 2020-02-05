package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-5 上午10:07
 * <p>
 * 类说明：
 */
public class Node {
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
