package main.java.offer.tencent;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-26 下午8:18
 * <p>
 * 类说明：
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[][] a = new int[n][2];
            int[][] b = new int[n][2];
            for (int i = 0; i < n; i++) {
                a[i][0] = in.nextInt();
                a[i][1] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i][0] = in.nextInt();
                b[i][1] = in.nextInt();
            }
            double res = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    double x = Math.pow(a[i][0]-b[j][0],2);
                    double y = Math.pow(a[i][1]-b[j][1],2);
                    double cur = Math.sqrt(x + y);
                    res = Math.min(res, cur);
                }
            }
            String r = String.format("%.3f",res);
            System.out.println(r);
        }
    }
}
