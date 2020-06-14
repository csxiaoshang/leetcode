package main.java.leetcode;

/**
 * @Author 北集
 * @Date 2020/6/14 11:18
 * @Description:
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 *
 * Each element in the array represents your maximum jump length at that position.
 *
 * Your goal is to reach the last index in the minimum number of jumps.
 *
 * Example:
 *
 * Input: [2,3,1,1,4]
 * Output: 2
 * Explanation: The minimum number of jumps to reach the last index is 2.
 *     Jump 1 step from index 0 to 1, then 3 steps to the last index.
 */
public class JumpGameII45 {
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int end = 0;
        int maxPosition = 0;
        int step = 0;
        for (int i = 0; i < nums.length -1; i++) {
            maxPosition = Math.max(maxPosition, nums[i] + i);
            if (i == end) {
                end = maxPosition;
                step++;
            }
            }
        return step;
    }

    /**
     * recursive time limit exceeded
     */
    class Solution1{
        int min = Integer.MAX_VALUE;
        public int jump(int[] nums) {
            if (nums.length == 1) {
                return 0;
            }
            recursive(nums, 0,0);
            return min;
        }

        private void recursive(int[] nums, int index,int step) {
            if (index == nums.length - 1) {
                min = Math.min(min, step);
                return ;
            }
            if (index >= nums.length) {
                return;
            }
            for (int i = 1; i <= nums[index]; i++) {
                int next = index + i;
                recursive(nums, next, step + 1);
            }
        }
    }

    /**
     * divide and solve  is also time limit exceeded
     */
    class Solution2{
        public int jump(int[] nums) {
            if (nums.length == 1) {
                return 0;
            }
            int min = recursive(nums, 0);
            return min;
        }

        private int recursive(int[] nums, int index) {
            if (index == nums.length - 1) {
                return 0;
            }
            if (index >= nums.length) {
                return -1;
            }
            int min = Integer.MAX_VALUE;
            for (int i = 1; i <= nums[index]; i++) {
                int next = index + i;
                int curRes =  recursive(nums, next);
                if (curRes != -1) {
                    min = Math.min(min, curRes);
                }
            }
            if (min == Integer.MAX_VALUE) {
                return -1;
            }
            return min+1 ;
        }
    }
}
