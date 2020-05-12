package main.java.leetcode;

import java.util.*;
/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-12 上午11:36
 * <p>
 * 类说明：
 */
public class MinimumNumberofArrowstoBurstBalloons452 {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int count =1;
        int end = points[0][1];
        for (int[] d : points) {
            if (d[0] <= end) {
                continue;
            }
            count++;
            end = d[1];
        }
        return count;
    }
}
