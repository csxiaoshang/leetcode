package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-8 上午11:54
 * <p>
 * 类说明：
 */
public class DailyTemperatures739 {
    public int[] dailyTemperatures(int[] T) {
        return solution1(T);
    }

    private int[] solution1(int[] T) {
        int n = T.length;
        int[] res = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int cur = T[i];
            for (int j = i + 1; j < n; j++) {
                if (T[j] > cur) {
                    res[i] = j-i;
                    break;
                }
            }
        }
        return res;
    }
}
