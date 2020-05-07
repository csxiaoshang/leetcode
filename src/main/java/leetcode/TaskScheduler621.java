package main.java.leetcode;

import java.util.*;
/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-7 下午3:29
 * <p>
 * 类说明：
 */
public class TaskScheduler621 {
    public int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];
        for (char c : tasks)
            map[c - 'A']++;
        Arrays.sort(map);
        int time = 0;
        while (map[25] > 0) {
            int i = 0;
            while (i <= n) {
                if (map[25] == 0)
                    break;
                if (i < 26 && map[25 - i] > 0)
                    map[25 - i]--;
                time++;
                i++;
            }
            Arrays.sort(map);
        }
        return time;
    }
}
