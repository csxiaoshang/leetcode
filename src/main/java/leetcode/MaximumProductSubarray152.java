package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-2 下午6:22
 * <p>
 * 类说明：
 */
public class MaximumProductSubarray152 {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        maxProduct(nums);
    }
    public static int maxProduct(int[] nums) {
        return solution1(nums);
    }

    /**
     * time limit
     * @param nums
     * @return
     */
    private static int solution1(int[] nums){
        int l = 0,r = nums.length-1;
        int max = Integer.MIN_VALUE;
        while (l <= r) {
            int cur = l;
            while (cur <= r) {
                int temp=1;
                for (int i = cur; i <= r; i++) {
                    temp *= nums[i];
                }
                max = Math.max(max, temp);
                cur++;
            }
            r--;
        }
        return max;
    }

    /**
     * dp
     * @param nums
     * @return
     */
    private int solution2(int[] nums){
            int n = nums.length;
            if (n == 0) {
                return 0;
            }

            int[] dpMax = new int[n];
            dpMax[0] = nums[0];
            int[] dpMin = new int[n];
            dpMin[0] = nums[0];
            int max = nums[0];
            for (int i = 1; i < n; i++) {
                dpMax[i] = Math.max(dpMin[i - 1] * nums[i], Math.max(dpMax[i - 1] * nums[i], nums[i]));
                dpMin[i] = Math.min(dpMin[i - 1] * nums[i], Math.min(dpMax[i - 1] * nums[i], nums[i]));
                max = Math.max(max, dpMax[i]);
            }
            return max;
        }
}
