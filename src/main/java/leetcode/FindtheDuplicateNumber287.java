package main.java.leetcode;

import java.util.*;
/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-3 上午11:49
 * <p>
 * 类说明：
 */
public class FindtheDuplicateNumber287 {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int l = 0, r = 1;
        while (r < nums.length) {
            if (nums[l] == nums[r]) {
                return nums[l];
            }
            l++;
            r++;
        }
        return nums[l];
    }
}
