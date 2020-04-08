package main.java.offer.wangyi;

import java.util.Scanner;
import java.util.Arrays;
/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-7 下午6:23
 * <p>
 * 类说明：
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }
        long res = getTest(n,a);
        System.out.println(res);
    }

    public static long getTest(int n, long[] temp) {
        long[] dp = new long[n - 1];
        for (int i = 1; i < n; i++) {
            dp[i-1] = temp[i]-temp[i-1];
            if (dp[i-1]<=0){
                return -1;
            }
        }
        Arrays.sort(dp);
        long res = dp[n-2];
        for (int i = n-2; i >=0; i--) {
            res = gcd(res,dp[i]);
        }
        return res;
    }

    public static long gcd(long m, long n) {
        while (m != n) {
            if (m > n) {
                m-=n;
            }else{
                n-=m;
            }
        }
        return m;
    }
}
