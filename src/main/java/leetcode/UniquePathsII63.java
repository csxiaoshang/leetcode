package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-17 上午9:25
 * <p>
 * 类说明：
 */
public class UniquePathsII63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        return solution1(obstacleGrid);
    }

    /**
     * dp
     * @param nums
     * @return
     */
    private int solution1(int[][] nums){
        if (nums == null || nums.length == 0 || nums[0].length == 0) {
            return 0;
        }
        int n = nums.length;
        int m = nums[0].length;
        int[][] dp = new int[n][m];
        if (nums[0][0] == 1) {
            dp[0][0] = 0;
        }else{
            dp[0][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            if (nums[0][i] == 1) {
                dp[0][i] = 0;
            }else{
                dp[0][i] = dp[0][i-1];
            }
        }
        for (int i = 1; i < n; i++) {
            if (nums[i][0] == 1) {
                dp[i][0] = 0;
            }else{
                dp[i][0] = dp[i-1][0];
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (nums[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i][j-1]+dp[i-1][j];
                }
            }
        }
        return dp[n-1][m-1];
    }
}
