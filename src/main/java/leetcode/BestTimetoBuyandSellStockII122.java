package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-23 上午9:18
 * <p>
 * 类说明：
 */
public class BestTimetoBuyandSellStockII122 {

    public int maxProfit(int[] prices) {
        return cal(prices, 0);
    }
    /**
     * 递归搜索
     * @param prices
     * @return
     */
    private int cal(int[] prices,int s){
        if(s>prices.length){
            return 0;
        }
        int max = 0;
        for(int i=s;i<prices.length;i++){
            int maxProfit = 0;
            for (int j = i+1;j<prices.length;j++){
                if(prices[j]>prices[i]){
                    int profit = cal(prices,j+1)+prices[j]-prices[i];
                    if(profit>maxProfit){
                        maxProfit = profit;
                    }
                }
            }
            max = Math.max(max, maxProfit);
        }
        return max;
    }

    /**
     * 贪心
     * @param prices
     * @return
     */
    private int tanxin(int[] prices){
        int max = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                max+=prices[i]-prices[i-1];
            }
        }
        return max;
    }
}
