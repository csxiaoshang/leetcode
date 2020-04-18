package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-17 上午9:38
 * <p>
 * 类说明：
 */
public class MinimumPathSum64 {
    public int minPathSum(int[][] grid) {
        return solution1(grid);
    }

    private int solution1(int[][] nums) {
        if (nums == null || nums.length == 0 || nums[0].length == 0) {
            return 0;
        }
        int n = nums.length;
        int m = nums[0].length;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = nums[i][j];
            }
        }
        for (int i = 1; i < m; i++) {
                dp[0][i] += dp[0][i-1];
        }
        for (int i = 1; i < n; i++) {
                dp[i][0] += dp[i-1][0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                    dp[i][j] += Math.min(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[n-1][m-1];
    }
}
