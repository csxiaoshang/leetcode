package main.java.leetcode;

import com.sun.javafx.image.IntPixelGetter;

import java.util.HashSet;
import java.util.*;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-3 上午11:13
 * <p>
 * 类说明：
 */
public class PerfectSquares279 {
    public static void main(String[] args) {
        numSquares(12);
    }
    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] =0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }
}
