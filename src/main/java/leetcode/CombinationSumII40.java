package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-3 上午11:03
 * <p>
 * 类说明：
 */
public class CombinationSumII40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backTrace(candidates, target, res, new ArrayList<>(),0);
        return res;
    }

    private  void backTrace(int[] nums, int target, List<List<Integer>> res, List<Integer> list, int s) {
        int sum = 0;
        for (int i : list) {
            sum+=i;
        }
        if (sum >= target) {
            if (sum == target) {
                res.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i=s;i<nums.length;i++){
            //跳过重复的数字
            if(i > s && nums[i] == nums[i-1]) {
                continue;
            }
            list.add(nums[i]);
            backTrace(nums,target,res,list,i+1);
            list.remove(list.size() - 1);
        }
    }
}
