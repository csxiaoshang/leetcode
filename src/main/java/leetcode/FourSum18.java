package main.java.leetcode;

import java.util.*;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-26 下午10:42
 * <p>
 * 类说明：
 */
public class FourSum18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        return solution1(nums,target);
    }

    /**
     * Time Limit Exceeded
     * @param nums
     * @param target
     * @return
     */
    private List<List<Integer>> solution1(int[] nums, int target){
        Set<List<Integer>> res = new HashSet<>();
        int len = nums.length;
        if(len == 0){
            return new ArrayList<>(res);
        }
        Arrays.sort(nums);
        trace(nums,0,0,4,target,res,new ArrayList<Integer>());
        return new ArrayList<>(res);
    }
    private List<List<Integer>> solution2(int[] nums,int target){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        //多加了层循环
        for (int j = 0; j < nums.length - 3; j++) {
            //防止重复的
            if (j == 0 || (j > 0 && nums[j] != nums[j - 1]))
                for (int i = j + 1; i < nums.length - 2; i++) {
                    //防止重复的，不再是 i == 0 ，因为 i 从 j + 1 开始
                    if (i == j + 1 || nums[i] != nums[i - 1]) {
                        int lo = i + 1, hi = nums.length - 1, sum = target - nums[j] - nums[i];
                        while (lo < hi) {
                            if (nums[lo] + nums[hi] == sum) {
                                res.add(Arrays.asList(nums[j], nums[i], nums[lo], nums[hi]));
                                while (lo < hi && nums[lo] == nums[lo + 1]) {
                                    lo++;
                                }
                                while (lo < hi && nums[hi] == nums[hi - 1]) {
                                    hi--;
                                }
                                lo++;
                                hi--;
                            } else if (nums[lo] + nums[hi] < sum) {
                                lo++;
                            } else {
                                hi--;
                            }
                        }
                    }
                }
        }
        return res;
    }
    private void trace(int[] nums,int s,int step,int n,int target,Set<List<Integer>> res,List<Integer> list){
        int len = nums.length;
        if(s>=len&&step<n){
            return ;
        }
        int tem = 0;
        for(int i:list){
            tem +=i;
        }
        if(step == n){
            if(tem == target){
                res.add(list);
            }
            return;
        }
        for(int i = s;i<len;i++){
            list.add(nums[i]);
            trace(nums,i+1,step+1,n,target,res,new ArrayList<>(list));
            list.remove(list.size()-1);
        }
    }
}
