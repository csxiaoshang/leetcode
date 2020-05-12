package main.java.leetcode;

import java.util.*;
/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-12 上午11:22
 * <p>
 * 类说明：
 */
public class NonoverlappingIntervals435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int count = 1;
        int end = intervals[0][1];
        for (int[] d : intervals) {
            if (d[0] < end) {
                continue;
            }
            count++;
            end = d[1];
        }
        return intervals.length - count;
    }
}
