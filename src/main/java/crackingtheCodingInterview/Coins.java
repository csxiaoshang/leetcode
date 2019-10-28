package main.java.crackingtheCodingInterview;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-10-25 下午7:01
 * <p>
 * 类说明：
 */
public class Coins {
    public int countWays(int n) {
        // write code here
/**
 *
 * 运行超时
 */

/*        int[][] res = new int[4][n+1];
        int[] coins = new int[]{1, 5, 10, 15};
        for (int i = 0; i <= n; i++) {
            res[0][i] = 1;
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j <= n; j++) {
                int tem =0;
                int coin = coins[i];
                for (int k = 0; k <= j / coins[i]; k++) {
                    tem += res[i - 1][j - k * coin];
                }
                res[i][j]=tem%1000000007;
            }
        }
        return res[3][n];*/

        int[] coins = new int[]{1, 5, 10, 25};
        int[] dp = new int[100001];
        dp[0] = 1;
        for (int i = 0; i < 4; ++i) {
            for (int j = coins[i]; j <= n; ++j) {
                dp[j] = (dp[j] + dp[j - coins[i]]) % 1000000007;
            }
        }
        return dp[n];
    }
}
