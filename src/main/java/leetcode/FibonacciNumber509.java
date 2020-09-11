package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-9-9 上午9:39
 * <p>
 * 类说明：
 */
public class FibonacciNumber509 {

    public int fib(int N) {

        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }

        int[] nums = new int[N + 1];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i <= N; i++) {
            nums[i] = nums[i-1] + nums[i+2];
        }
        return nums[N];
    }
}
