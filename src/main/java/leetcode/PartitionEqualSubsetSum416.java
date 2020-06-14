package main.java.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-6 上午10:36
 * <p>
 * 类说明：
 */
public class PartitionEqualSubsetSum416 {
    Set<String> mem= new HashSet<>();
    public boolean canPartition(int[] nums) {
        int N= nums.length;
        int sum=0;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for(int i=0;i<N;i++)
        {
            sum+=nums[i];
        }
        if((sum&1)== 1)
            return false;

        int target=sum/2;
        return recur(nums,target,0);
    }

    boolean recur(int nums[],int target, int index)
    {
        if(target == 0)
            return true;
        else if(target < 0)
            return false;
        String key = target+"-"+index;
        if(mem.contains(key)){
            return false;
        }

        //System.out.println(target+"-"+index);
        for(int i=index;i<nums.length;i++)
        {
            if(recur(nums,target-nums[i],i+1))
                return true;
        }
        mem.add(key);
        return false;
    }

    /**
     *  回溯法超时
     */
    class solution1{
        boolean isCanPartition = false;
        public boolean canPartition(int[] nums) {
            if (nums == null || nums.length == 0) {
                return false;
            }
            int n = nums.length;
            int sum = 0;
            for (int i : nums) {
                sum += i;
            }
            if (sum % 2 == 1) {
                return false;
            }
            Set<Integer> set = new HashSet<>();
            backTrace(nums, 0, 0,sum,set);
            return isCanPartition ;
        }

        private void backTrace(int[] nums, int index, int curSum ,int sum,Set<Integer> set) {
            if (curSum == sum >> 1) {
                isCanPartition = true;
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (!set.contains(i)) {
                    set.add(i);
                    backTrace(nums, i+1, curSum + nums[i], sum,set);
                    set.remove(i);
                }
            }
        }
    }
}
