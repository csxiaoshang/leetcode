package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-5 下午4:52
 * <p>
 * 类说明：
 */
public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        int res = 0;
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int len = prices.length;
        for (int i = 1; i < len; i++) {
            if (prices[i] > prices[i-1]) {
                res += prices[i]-prices[i-1];
            }
        }
        return res;
    }
}
