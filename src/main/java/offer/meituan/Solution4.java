package main.java.offer.meituan;

import java.util.Scanner;
import java.util.Arrays;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-8-29 下午5:04
 * <p>
 * 类说明：
 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n+1];
        Arrays.fill(b, -1);
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }
        int t = in.nextInt();
        while (t-- > 0) {
            int way = in.nextInt();
            if (way == 1) {
                int k = in.nextInt();
                int x = in.nextInt();
                int y = in.nextInt();
                System.arraycopy(a, x, b, y, k);
            }else {
                System.out.println(b[in.nextInt()]);
            }
        }
    }
}
