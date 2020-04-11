package main.java.offer.wangyihuyu;

import java.util.*;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-11 下午7:04
 * <p>
 * 类说明：
 * 40%
 */
public class Solution2 {
    static int count = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] w = new int[n];
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            t[i] = in.nextInt();
        }
        Arrays.sort(w);
        Arrays.sort(t);
        for (int i = 0; i < n / 2; i++) {
            int tem = t[i];
            t[i] = t[n - 1 - i];
            t[n-1-i] = tem;
        }
        int m = in.nextInt();
        trace(w,t,0,new ArrayList<>(),m,new HashSet<Integer>());
        int res = count%m;
        System.out.println(res);
    }

    private static void trace(int[] w, int[] t, int s, List<Integer> list,int m,Set<Integer> set) {
        if (s == w.length) {
            count++;
            count = count % m;
        }
        for (int i = 0; i < w.length; i++) {
            int index = list.size();
            if (w[i] < t[index] || set.contains(i)) {
                continue;
            }
            list.add(w[i]);
            set.add(i);
            trace(w,t,s+1,new ArrayList<>(list),m,new HashSet<>(set));
            set.remove(i);
            list.remove(list.size() - 1);
        }
    }
}
