package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-18 上午8:48
 * <p>
 * 类说明：
 */
public class ClimbingStairs70 {
    public int climbStairs(int n) {
        return solution1(n);
    }

    private int solution1(int n) {
        if (n == 1) {
            return 1;
        }
        int[] nums = new int[n+1];
        nums[1] = 1;
        nums[2] = 2;
        for (int i = 3; i <= n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
    }
}
