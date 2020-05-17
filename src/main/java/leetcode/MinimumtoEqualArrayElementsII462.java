package main.java.leetcode;

import java.util.*;
/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-17 上午9:43
 * <p>
 * 类说明：
 */
public class MinimumtoEqualArrayElementsII462 {
    public int minMoves2(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        int l=0;
        int h = nums.length - 1;
        while (l < h) {
            res += nums[h--] - nums[l++];
        }
        return res;
    }
}
