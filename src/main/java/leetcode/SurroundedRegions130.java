package main.java.leetcode;

import java.util.LinkedList;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-25 下午10:22
 * <p>
 * 类说明：
 */
public class SurroundedRegions130 {
    public static void main(String[] args) {
        solve(new char[][]{
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
});
    }
    public static void solve(char[][] board) {
        int[][] dirs = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        if (board == null || board.length == 0) {
            return;
        }
        int n = board.length;
        int m = board[0].length;
        int[][] dir = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        LinkedList<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O') {
                queue.add(new int[]{i, 0});
                visited[i][0] = true;
                dir[i][0] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (board[i][m-1] == 'O') {
                queue.add(new int[]{i, m-1});
                visited[i][m-1] = true;
                dir[i][m-1] = 1;
            }
        }
        for (int i = 0; i < m; i++) {
            if (board[0][i] == 'O') {
                queue.add(new int[]{0, i});
                visited[0][i] = true;
                dir[0][i] = 1;
            }
        }
        for (int i = 0; i < m; i++) {
            if (board[n-1][i] == 'O') {
                queue.add(new int[]{n-1, i});
                visited[n-1][i] = true;
                dir[n-1][i] = 1;
            }
        }
        while (!queue.isEmpty()) {
            int[] d = queue.poll();
            for (int[] ds : dirs) {
                int x = d[0]+ds[0];
                int y = d[1]+ds[1];
                if (x < 0 || x >= n || y < 0 || y >= m || visited[x][y] || board[x][y] == 'X') {
                    continue;
                }
                visited[x][y] = true;
                dir[x][y] = 1;
                queue.offer(new int[]{x, y});
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dir[i][j] == 0) {
                    board[i][j] = 'X';
                }
            }
        }
    }
}
