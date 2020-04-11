package main.java.offer.pinduoduo;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-10 下午8:00
 * <p>
 * 类说明：
 * 30%
 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextLong();
        }
        int[][] dp = new int[n][k + 1];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i][j] = 1;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int l = i - 1; l >= i - k - 1 && l >= 0; l--) {
                if (nums[i] == nums[l]) {
                    int count = i - l - 1;
                    for (int j = 0; j <= k; j++) {
                        if (j - count >= 0) {
                            dp[i][j] = dp[l][j - count] +1;
                        } else {
                            dp[i][j] = 1;
                        }
                    }
                    break;
                }
            }
        }
        long res =0;
        for (int i = 0; i < n; i++) {
            res = Math.max(res ,dp[i][k]);
        }
        System.out.println(res);
    }

}
