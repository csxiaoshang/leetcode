package main.java.leetcode;

import java.util.HashMap;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-16 上午10:51
 * <p>
 * 类说明：
 */
public class UniquePaths62 {
    public static void main(String[] args) {
        UniquePaths62 u = new UniquePaths62();
        u.uniquePaths(3, 2);
    }
    int count = 0;
    int[][] dir = {{0,1},{1,0}};
    public int uniquePaths(int m, int n) {
        return solution3(m, n);
    }

    /**
     * dfs  解法不对
     * @param m
     * @param n
     * @return
     */
    private int solution1(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        boolean[][] v = new boolean[m][n];
        dfs(v,0,0,m -1,n-1);
        return count;
    }

    private void dfs(boolean[][] v, int x0, int y0, int x1, int y1) {
        int m = v.length;
        int n = v[0].length;
        for (int[] d : dir) {
            int x = x0 + d[0];
            int y = y0 + d[1];
            if (x < 0 || x >= m || y < 0 || y >= n || v[x][y]) {
                continue;
            }
            if (x0 == x1 && y0 == y1) {
                count++;
                return;
            }
            v[x][y] = true;
            dfs(v,x,y,x1,y1);
        }
    }

    /**
     * 带记忆的递归
     * @param m
     * @param n
     * @return
     */
    private int solution2(int m, int n) {
        HashMap<String, Integer> map = new HashMap<>();
        return getAns(0, 0, m - 1, n - 1, map);
    }

    private int getAns(int x0, int y0, int x1, int y1, HashMap<String, Integer> map) {
        if (x0 == x1 && y0 == y1) {
            return 1;
        }
        String key = x0+1 + "@" + y0;
        int n1 = 0,n2 = 0;
        if (!map.containsKey(key)) {
            if (x0 + 1 <= x1) {
                n1 = getAns(x0 + 1, y0, x1, y1, map);
            }
        }else{
            n1 = map.get(key);
        }
        key = x0+"@"+(y0+1);
        if (!map.containsKey(key)) {
            if (y0 + 1 <= y1) {
                n2 = getAns(x0 , y0+1, x1, y1, map);
            }
        }else{
            n2 = map.get(key);
        }
        key = x0 + "@" + y0;
        map.put(key, n1 + n2);
        return n1+n2;
    }

    private int solution3(int m, int n) {
        int[][] nums = new int[m][n];
        for (int i = 0; i < m; i++) {
            nums[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            nums[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                int a =0,b = 0;
                if (i - 1 >= 0) {
                    a = nums[i-1][j];
                }
                if (j - 1 >= 0) {
                    b = nums[i][j-1];
                }
                nums[i][j] = a+b;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
        return nums[m-1][n-1];
    }
}
