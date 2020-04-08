package main.java.offer.alibaba;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-8 下午4:12
 * <p>
 * 类说明：小强开始了他的功夫特训，特训时间为n秒，
 * 有m个木头人，每个木头人血量为a,
 * 小强的攻击范围为b,每次小强攻击能对最多b个存活的木头人造成1点伤害，
 * 每次攻击需要1秒，当经过一次攻击后，木头人的血量为0，木头人死亡。
 * 特训结束后，小强最多能消灭多少个木头人。
 * 第一行，一个整数t,
 * 接下来t行，每行四个正整数n,m,a,b。
 * 1<=t<=1000,1<=n,m,a,b,<=10^9
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
            for (int k = 0; k < m; k++) {
                queue.add(a);
            }
            for (int k = 0; k < n; k++) {
                if (queue.isEmpty()) {
                    break;
                }
                int[] tem = new int[b];
                for (int l = 0; l < b; l++) {
                    if (!queue.isEmpty()) {
                        tem[l] = queue.poll()-1;
                    }
                }
                for (int l = 0; l < b; l++) {
                    if (tem[l] > 0) {
                        queue.offer(tem[l]);
                    }
                }
            }
            System.out.println(m - queue.size());
        }
    }
}
