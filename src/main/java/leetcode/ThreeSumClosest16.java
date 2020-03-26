package main.java;

import java.util.Arrays;
/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-26 下午8:14
 * <p>
 * 类说明：
 */
public class ThreeSumClosest16 {
    public int threeSumClosest(int[] nums, int target) {
        return solution1(nums, target);
    }

    private int solution1(int[] nums, int target) {
        int min = 1<<31-1;
        int res = 0;
        int len = nums.length;
        if (len == 0) {
            return target;
        }
        Arrays.sort(nums);
        for(int i=0;i<len;i++){
            int tem = target -nums[i];
            for(int l = i+1,r = len-1;l<r;){
                int tres = nums[i] + nums[r] + nums[l];
                if(Math.abs((nums[l]+nums[r]+nums[i]-target))<min){
                    res=nums[l]+nums[r]+nums[i];
                    min=Math.abs(res-target);
                }
                if(nums[i]+nums[l]+nums[r]<target){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return res;
    }
}
