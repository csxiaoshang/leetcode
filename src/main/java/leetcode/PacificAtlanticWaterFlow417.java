package main.java.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-13 下午12:09
 * <p>
 * 类说明：
 */
public class PacificAtlanticWaterFlow417 {
    public static void main(String[] args) {

    }
    int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[][] p = new boolean[n][m];
        boolean[][] a = new boolean[n][m];
        Queue<int[]> pqueue = new LinkedList<>();
        Queue<int[]> aqueue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            pqueue.add(new int[]{i, 0});
            aqueue.add(new int[]{i,m-1});
            p[i][0] = true;
            a[i][m-1] = true;
        }
        for (int i = 0; i < m; i++) {
            pqueue.offer(new int[]{0, i});
            aqueue.offer(new int[]{n - 1, i});
            p[0][i] = true;
            a[n - 1][i] = true;
        }
        bfs(matrix, pqueue, p);
        bfs(matrix, aqueue, a);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (p[i][j] && a[i][j]) {
                    List<Integer> cur = new ArrayList<>();
                    cur.add(i);
                    cur.add(j);
                    res.add(cur);
                }
            }
        }
        return res;
    }

    private void bfs(int[][] matrix, Queue<int[]> queue, boolean[][] v) {
        int n = matrix.length;
        int m = matrix[0].length;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            for (int[] d : dir) {
                int x = cur[0] + d[0];
                int y = cur[1] + d[1];
                if (x < 0 || x >= n || y < 0 || y >= m || v[x][y] || matrix[x][y] < matrix[cur[0]][cur[1]]) {
                    continue;
                }
                queue.offer(new int[]{x, y});
                v[x][y] = true;
            }
        }

    }
}
