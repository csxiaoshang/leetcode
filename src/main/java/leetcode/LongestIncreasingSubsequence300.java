package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-11 下午2:13
 * <p>
 * 类说明：
 */
public class LongestIncreasingSubsequence300 {
    public int lengthOfLIS(int[] nums) {
        if(nums.length== 0){
            return 0;
        }
        int[] len = new int[nums.length];
        len[0] = 1;
        int res = 1;
        for(int i =1;i<nums.length;i++){
            int max = 1;
            for(int j = 0;j<i;j++){
                if(nums[i] > nums[j]){
                    max = max > len[j] +1 ? max: len[j] +1;
                }
            }
            len[i] = max;
            res = Math.max(res,max);
        }
        return res;
    }
}

