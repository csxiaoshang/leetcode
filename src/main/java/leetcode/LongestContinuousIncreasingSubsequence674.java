package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-12-30 上午9:36
 * <p>
 * 类说明：
 */
public class LongestContinuousIncreasingSubsequence674 {

    /**
     * 时间复杂度o(n^2)
     * @param nums
     * @return
     */
    public int findLengthOfLCIS(int[] nums) {
        int res = 0;
        int length = nums.length;
        for(int i=0;i<length;i++){
            int count = 1;
            int tem =nums[i];
            for(int j=i+1;j<length;j++){
                if(nums[j]>tem){
                    count++;
                    tem = nums[j];
                }else
                    break;
            }
            res = count>res?count:res;
        }
        return res;
    }
}
