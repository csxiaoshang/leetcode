package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-9-22 上午10:41
 * <p>
 * 类说明：
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 *
 * Example:
 *
 * Given nums = [-2, 0, 3, -5, 2, -1]
 *
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 *
 *
 * Constraints:
 *
 * You may assume that the array does not change.
 * There are many calls to sumRange function.
 * 0 <= nums.length <= 10^4
 * -10^5 <= nums[i] <= 10^5
 * 0 <= i <= j < nums.length
 */
public class RangeSumQueryImmutable3030 {
/*    int[][] dp;

    public RangeSumQueryImmutable3030(int[] nums) {
        int n = nums.length;
        dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                dp[i][j] = dp[i][j - 1] + nums[j];
            }
        }
    }

    public int sumRange(int i, int j) {

        return dp[i][j];
    }*/

    private int[] sum;

    public RangeSumQueryImmutable3030(int[] nums) {
        sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }
}
