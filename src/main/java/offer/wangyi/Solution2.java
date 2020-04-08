package main.java.offer.wangyi;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-7 下午7:25
 * <p>
 * 类说明：
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(a[i], b[i]);
        }
        Arrays.sort(nodes, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.a-o2.a;
            }
        });
        int res = 0;
        for (Node node : nodes) {
            if (d >= node.a) {
                d++;
            }else {
                res += node.b;
            }
        }
        System.out.println(res);
    }
}
class Node{
    int a;
    int b;

    public Node(int a, int b) {
        this.a=a;
        this.b = b;
    }
}
