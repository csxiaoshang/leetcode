package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-6 下午5:38
 * <p>
 * 类说明：
 */
public class BestTimetoBuyandSellStockIII123 {
    public int maxProfit(int[] prices) {
        return solution1(prices);
    }

    private int solution1(int[] prices) {
        int len = prices.length;
        if (len == 0) {
            return 0;
        }
        int[][] dp = new int[len][3];
        for (int k = 1; k < 3; k++) {
            for (int i = 1; i < len; i++) {
                int max = Integer.MIN_VALUE;
                for (int j = 0; j < i; j++) {
                    max = Math.max(max, prices[i] - prices[j] + dp[j][k - 1]);
                }
                dp[i][k] = Math.max(dp[i - 1][k], max);
            }
        }
        return dp[len-1][2];
    }
}
