package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-11 下午1:14
 * <p>
 * 类说明： 并查集问题
 */
public class RedundantConnection684 {
    public int[] findRedundantConnection(int[][] edges) {
        if (edges == null) {
            return new int[]{-1, -1};
        }
        int n = edges.length;
        int[] pre = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            pre[i] = i;
        }
        for (int[] d : edges) {
            int v = d[0];
            int u = d[1];
            int root1 = find(v, pre);
            int root2 = find(u, pre);
            if (root1 != root2) {
                pre[root1] = root2;
            }else {
                return d;
            }
        }
        return new int[]{-1, -1};
    }

    private int find(int root,int[] pre) {
        int son = root,temp;
        while (root != pre[root]) {
            root = pre[root];
        }
        while (son != root) {
            temp = pre[son];
            pre[son] = root;
            son = temp;
        }
        return root;
    }
}
