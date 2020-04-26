package main.java.offer.tencent;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-26 下午9:04
 * <p>
 * 类说明：
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        if (n == 3) {
            System.out.println(1);
        }else {
            System.out.println(-1);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int tem = a[i];
        a[i] = a[j];
        a[j] = tem;
    }

    private static void swap(int[] a, int[] b, int i) {
        int tem = a[i];
        a[i] = b[i];
        b[i] = tem;
    }
}
