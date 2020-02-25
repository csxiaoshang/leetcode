package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-24 下午11:29
 * <p>
 * 类说明：
 */
public class MaximumSubarray55 {

    /**
     * o(n^2)
     * @param nums
     * @return
     */
    public int maxSubArray1(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            sum = nums[i];
            for(int j = i+1;j<nums.length;j++){
                max = Math.max(sum,max);
                sum+=nums[j];
            }
            max = Math.max(sum,max);
        }
        return max;
    }

    /**
     * dp o(n)
     * according nums[n] as tail
     * @param nums
     * @return
     */
    public int maxSubArray2(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i:nums){
            if(sum<=0){
                sum = i;
            }else{
                sum+=i;
            }
            max =Math.max(max,sum);
        }
        return max;
    }
}
