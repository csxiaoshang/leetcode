package main.java.offer.tencent;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-26 下午8:48
 * <p>
 * 类说明：
 */
public class Solution5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            long x = in.nextLong();
            int k = in.nextInt();
            long l = (long) Math.pow(2, k - 1);
            long r = (long) (Math.pow(2,k)-1);
            if (x < l ||
                    (x >= l && x <= r)) {
                System.out.println(-1);
            }else {
                find(x, k);
            }

        }
    }

    private static long  find(long x, int k) {
        if (x == 0) {
            return 1;
        }
        long count = find(x / 2, k);
        if (count == k) {
            System.out.println(x);
        }
        return count+1;
    }
}
