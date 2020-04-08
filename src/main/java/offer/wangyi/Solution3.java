package main.java.offer.wangyi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-7 下午7:25
 * <p>
 * 类说明：
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int f = in.nextInt();
        set.add(f);
        int res = 0;
        for (int i = 0; i < m; i++) {
            int k = in.nextInt();
            int[] a = new int[k];
            boolean flag = false;
            for (int j = 0; j < k; j++) {
                a[j] = in.nextInt();
                if (set.contains(a[j])) {
                    flag = true;
                }
            }
            if (flag) {
                for (int j = 0; j < k; j++) {
                    set.add(a[j]);
                }
            }
        }
        res = set.size()>n?n:set.size();
        System.out.println(res);

    }
}
