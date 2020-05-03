package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-3 上午8:11
 * <p>
 * 类说明：
 */
public class MaximalSquare221 {
    public static void main(String[] args) {
        char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},
                {'1','1','1','1','1'},{'1','0','0','1','0'}};
        maximalSquare(matrix);
    }
    public static int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0
                || matrix[0].length == 0) {
            return 0;
        }
            int rows = matrix.length;
            if (rows == 0) {
                return 0;
            }
            int cols = matrix[0].length;
            int[][] dp = new int[rows + 1][cols + 1];
            int maxSide = 0;
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    //因为多申请了一行一列，所以这里下标要减 1
                    if (matrix[i - 1][j - 1] == '0') {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                        maxSide = Math.max(dp[i][j], maxSide);
                    }
                }
            }
            return maxSide * maxSide;
    }

    /**
     * 思路错了　dp存储的值应该会以当前位置为正方形右下角的边长，不应该存储面积
     * @param matrix
     * @return
     */
    private static int solution1(char[][] matrix) {
        int max = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        dp[0][0] = matrix[0][0] - '0';
        for (int i = 1; i < m; i++) {
            dp[0][i] = matrix[0][i] == '0' ? 0 :dp[0][i-1]+1;
        }
        for (int i = 1; i < n; i++) {
            dp[i][0] = matrix[i][0] == '0' ? 0 :dp[i-1][0]+1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = matrix[i][j] == '0' ? 0 :Math.max(dp[i-1][j]*dp[i][j-1],matrix[i][j]-'0');
                max = Math.max(max, dp[i][j]);
            }
        }
        return max;
    }
}
