package main.java.leetcode;

/**
 * @Author 北集
 * @Date 2020/6/11 21:06
 * @Description:
 * Given n balloons, indexed from 0 to n-1. Each balloon is painted with a number on it represented by array nums. You are asked to burst all the balloons.
 * If the you burst balloon i you will get nums[left] * nums[i] * nums[right] coins.
 * Here left and right are adjacent indices of i. After the burst, the left and right then becomes adjacent.
 *
 * Find the maximum coins you can collect by bursting the balloons wisely.
 *
 * Note:
 *
 * You may imagine nums[-1] = nums[n] = 1. They are not real therefore you can not burst them.
 * 0 ≤ n ≤ 500, 0 ≤ nums[i] ≤ 100
 * Example:
 *
 * Input: [3,1,5,8]
 * Output: 167
 * Explanation: nums = [3,1,5,8] --> [3,5,8] -->   [3,8]   -->  [8]  --> []
 *              coins =  3*1*5      +  3*5*8    +  1*3*8      + 1*8*1   = 167
 * 太难了！！！
 */
public class BurstBalloons312 {
    public int maxCoins(int[] nums) {
        int[] num = new int[nums.length + 2];
        for (int i = 1; i <= nums.length; i++) {
            num[i] = nums[i - 1];
        }
        num[0]=num[num.length-1] = 1;
        int len = num.length;
        int[][] dp = new int[len][len];
        for (int k = 2; k < len; k++) {
            for (int l = 0; l < len; l++) {
                int r = l +k;
                for (int i = l + 1; i < r; i++) {
                    dp[l][r] = Math.max(dp[l][r], num[l] * num[i] * num[r] + dp[l][i]+ dp[i][r]);
                }
            }
        }
        return dp[0][len - 1];
    }

}
