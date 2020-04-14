package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-14 上午9:02
 * <p>
 * 类说明：
 */
public class JumpGame55 {
    public boolean canJump(int[] nums) {
        return solution1(nums);
    }

    /**
     * 回溯的方式　time limit
     * @param nums
     * @return
     */
    private boolean solution1(int[] nums) {
        if (nums == null) {
            return false;
        }
        return trace(nums, 0);
    }

    private boolean trace(int[] nums,int s) {
        int n = nums.length;
        if (s == n - 1) {
            return true;
        }
        if (s >= n) {
            return false;
        }
        int cur = nums[s];
        for (int i = 1; i <= cur; i++) {
            if (trace(nums,s+i)){
                return true;
            }
        }
        return false;
    }

    /**
     * 带有记忆的回溯
     * @param nums
     * @return
     */
    private boolean solution2(int[] nums) {
        if (nums == null) {
            return false;
        }
        Index[] memo = new Index[nums.length];
        for (int i = 0; i < nums.length; i++) {
            memo[i] = Index.UNKNOW;
        }
        memo[nums.length-1] = Index.GOOD;
        return memoTrace(nums, 0, memo);
    }

    private boolean memoTrace(int[] nums, int s,Index[] memo) {
        if (memo[s] != Index.UNKNOW) {
            return memo[s] == Index.GOOD;
        }
        int cur = nums[s];
        for (int i = 1; i <= cur; i++) {
            if (memoTrace(nums,s+i,memo)){
                memo[s] = Index.GOOD;
                return true;
            }
        }
        memo[s] = Index.BAD;
        return false;
    }

    /**
     * dp
     * @param nums
     * @return
     */
    private boolean solution3(int[] nums){
        if (nums == null) {
            return false;
        }
        int n = nums.length;
        Index[] memo = new Index[n];
        for (int i = 0; i < n; i++) {
            memo[i] = Index.UNKNOW;
        }
        memo[n - 1] = Index.GOOD;
        for (int i = n - 2; i >= 0; i--) {
            int cur = nums[i];
            int len = Math.min(n-1, i + cur);
            for (int j = i+1; j <= len; j++) {
                if (memo[j] == Index.GOOD) {
                    memo[i] = Index.GOOD;
                    break;
                }
            }
        }
        return memo[0]==Index.GOOD;
    }

    /**
     * greedy
     * @param nums
     * @return
     */
    private boolean solution4(int[] nums) {
        if (nums == null) {
            return false;
        }
        int pos = nums.length-1;
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (i + nums[i] >= pos) {
                pos = i;
            }
        }
        return pos == 0;
    }
}
enum Index{
    GOOD,BAD,UNKNOW
}
