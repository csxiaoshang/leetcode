package main.java.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author 北集
 * @Date 2020/6/17 17:02
 * @Description:
 * Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the
 * area of largest rectangle in the histogram.
 * Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].
 * The largest rectangle is shown in the shaded area, which has area = 10 unit.
 * Example:
 *
 * Input: [2,1,5,6,2,3]
 * Output: 10
 */
public class LargestRectangleinHistogram84 {
    public int largestRectangleArea(int[] heights) {
        int max = Integer.MIN_VALUE;
        int l = 0;
        int r = 0;
        return max;
    }
    class Solution1{
        public int largestRectangleArea(int[] heights) {
            int max = 0;
            Set<Integer> set = new HashSet<>();
            for (int i : heights) {
                set.add(i);
            }
            for (int h : set) {
                int width = 0;
                int maxWidth = 0;
                for (int i : heights) {
                    if (i >= h) {
                        width++;
                    }else {
                        maxWidth = Math.max(maxWidth, width);
                        width = 0;
                    }
                }
                max = Math.max(max, h * maxWidth);
            }
            return max;
        }
    }
}
