package main.java;

import java.util.Arrays;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-5-7 下午7:18
 * <p>
 * 类说明：
 * 动态规划 leetcode279
 */
public class NumSquares {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1; i <= n; ++i) {
            int min = Integer.MAX_VALUE;
            int j = 1;
            while(i - j*j >= 0) {
                min = Math.min(min, dp[i - j*j] + 1);
                ++j;
            }
            dp[i] = min;
        }
        return dp[n];
    }
}
