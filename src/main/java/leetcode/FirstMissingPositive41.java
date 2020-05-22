package main.java.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-22 上午9:26
 * <p>
 * 类说明：
 */
public class FirstMissingPositive41 {
    public int firstMissingPositive(int[] nums) {
        return solution1(nums);
    }

    /**
     * o(n)时间复杂度　o(n)空间复杂度
     * @param nums
     * @return
     */
    private int solution1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }
        Map<Integer, Boolean> map = new HashMap<>(16);
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            max = Math.max(i, max);
            map.put(i, true);
        }
        for (int i = 1; i <= max; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return max >=0 ? max +1:1;
    }

    private int solution2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }
        int n = nums.length;
        //遍历每个数字
        for (int i = 0; i < n; i++) {
            //判断交换回来的数字
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                //第 nums[i] 个位置的下标是 nums[i] - 1
                swap(nums, i, nums[i] - 1);
            }
        }
        //找出第一个 nums[i] != i + 1 的位置
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        //如果之前的数都满足就返回 n + 1
        return n + 1;
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
