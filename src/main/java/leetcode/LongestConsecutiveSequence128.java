package main.java.leetcode;

import java.util.HashSet;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-6-25 下午5:32
 * <p>
 * 类说明：
 */
public class LongestConsecutiveSequence128 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            //n - 1 是否存在
            if (!set.contains(num - 1)) {
                int count = 0;
                while (set.contains(num)) {
                    count++;
                    num += 1;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }

}
