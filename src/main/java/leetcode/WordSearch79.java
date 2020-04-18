package main.java.leetcode;

import java.util.LinkedList;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-18 上午10:33
 * <p>
 * 类说明：
 */
public class WordSearch79 {
    int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public boolean exist(char[][] board, String word) {
        return solution2(board, word);
    }

    /**
     * bfs无法解决此问题
     *
     * @param board
     * @param word
     * @return
     */
    private boolean solution1(char[][] board, String word) {
        char[] chars = word.toCharArray();
        int n = board.length;
        int m = board[0].length;
        LinkedList<Node> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == chars[0]) {
                    queue.offer(new Node(i, j, 0));
                    boolean[][] v = new boolean[n][m];
                    v[i][j] = true;
                    while (!queue.isEmpty()) {
                        Node node = queue.poll();
                        if (node.index == chars.length - 1 && board[node.x][node.y] == chars[node.index]) {
                            return true;
                        }
                        for (int[] d : dir) {
                            int x = node.x + d[0];
                            int y = node.y + d[1];
                            if (x < 0 || x >= n || y < 0 || y >= m || v[x][y]) {
                                continue;
                            }
                            queue.offer(new Node(x, y, node.index + 1));
                            v[x][y] = true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean solution2(char[][] board, String word) {
        char[] chars = word.toCharArray();
        int n = board.length;
        int m = board[0].length;
        boolean[][] v = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (trace(i, j, board, 0, word,v)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean trace(int x, int y, char[][] board, int index, String word, boolean[][] v) {
        int n = board.length;
        int m = board[0].length;
        if (x < 0 || x >= n || y < 0 || y >= m || v[x][y] || board[x][y] != word.charAt(index)) {
            return false;
        }
        if (index == word.length() - 1) {
            return true;
        }
        v[x][y] = true;
        for (int[] d : dir) {
            int nx = x + d[0];
            int ny = y + d[1];
            if (trace(nx, ny, board, index + 1, word, v)) {
                return true;
            }
        }
        v[x][y] = false;
        return false;
    }


}

class Node {
    int x;
    int y;
    int index;

    public Node(int x, int y, int index) {
        this.x = x;
        this.y = y;
        this.index = index;
    }
}
