package main.java.offer.offer2;

import java.util.Scanner;
import java.util.*;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-21 下午2:52
 * <p>
 * 类说明：霍格沃茨魔法学院已经被伏地魔所带领的食死徒军团团团包围，哈利波特和他的凤凰社小伙伴们突围的唯一办法是利用哈利的隐身斗篷突围到魔法学院外，哈利的隐身斗篷最多只能藏匿 2 个魔法师，哈利的计划是，两个人用隐身斗篷突围，再由一名已经突围的小伙伴穿着隐身斗篷回到学院内，由两名小伙伴突围。假设每名魔法师突围的时间不一样，两名魔法师同时突围时，两人的行进速度要以较慢的魔法师为准。每名魔法师自己突围和返回的时间是一样的，请问，霍格沃茨魔法学院的所有小伙伴突围成功共需要多少时间？
 *
 * 输入
 * n 个小伙伴，设 n < 100
 * 每个人独自逃离魔法学院的时间 a1 a2 a3 a4 … an
 * 设 an < 100
 *
 * 输出
 * 逃离魔法学院的总时间
 *
 * 样例输入
 * 5
 * 1 2 4 5 10
 *
 * 样例输出
 * 22
 */
public class HaliPote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        int []dp = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);
        dp[0] = a[0];
        dp[1] = a[1];
        for (int i = 2; i < n; i++)
            dp[i] = Math.min(dp[i-1] + a[0] + a[i], dp[i-2] + a[0] + a[i] + 2 * a[1]);

        System.out.println(dp[n-1]);
    }
}
