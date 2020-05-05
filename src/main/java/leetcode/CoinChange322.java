package main.java.leetcode;

import java.util.HashSet;
import java.util.*;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-5 上午10:32
 * <p>
 * 类说明：
 */
public class CoinChange322 {
    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0) {
            return -1;
        }
        Set<Integer> set = new HashSet<>();
        for (int i : coins) {
            set.add(i);
        }
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
             dp[i] = amount+1;
            for (int j : coins) {
                if (i - j >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - j]+1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}
