package main.java;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-5-5 下午9:15
 * <p>
 * 类说明：
 */
public class IntegerBreak343 {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            for(int j = 1; j <= i - 1; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * dp[i - j], j * (i - j)));
            }
        }
        return dp[n];
    }
}
