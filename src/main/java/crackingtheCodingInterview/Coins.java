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

/*    public int countWays2(int n) {

        int[] coins = new int[]{25,10,5,1};
        int[] dp = new int[100001];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            int a =i-25;
            int b = i-10;
            int c = i -5;
            int d = i-1;
            int tem1 = a>=0?dp[a]*dp[25]:0;
            int tem2 = b>=0?dp[b]*dp[10]:0;
            int tem3 = c>=0?dp[c]*dp[5]:0;
            int tem4 = d>=0?dp[d]*dp[1]:0;
            dp[i] = tem1+tem2+tem3+tem4;
        }
        return dp[n];
    }*/
}
