package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-7 上午10:54
 * <p>
 * 类说明：
 */
public class TargetSum494 {
    int res = 0;
    public int findTargetSumWays(int[] nums, int S) {
        return solution1(nums, S);
    }

    /**
     * dfs
     * @param nums
     * @param S
     * @return
     */
    private int solution1(int[] nums,int S){
        int sum = 0;
        trace(nums,0,sum,S);
        return res;
    }
    private void trace(int[] nums ,int index ,int sum,int target){
        if (index == nums.length) {
            if (sum == target) {
                res++;
            }
                return;
        }
        trace(nums,index+1,sum+nums[index],target);
        trace(nums,index+1,sum-nums[index],target);
    }
}
