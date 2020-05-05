package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-4 上午8:51
 * <p>
 * 类说明：
 */
public class BestTimetoBuyandSellStockwithCooldown309 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int n = prices.length;
        int[] buy = new int[n];
        int[] sell = new int[n];
        int[] rest = new int[n];
        buy[0] = -prices[0];
        sell[0] = 0;
        rest[0] = 0;
        int max = 0;
        for (int i = 1; i < n; i++) {
            buy[i] = Math.max(rest[i - 1] - prices[i], buy[i - 1]);
            rest[i] = Math.max(sell[i - 1], Math.max(rest[i - 1], buy[i - 1]));
            sell[i] = Math.max(buy[i - 1] + prices[i], sell[i - 1]);
            max = Math.max(max, sell[i]);
        }
        return max;
    }
}
