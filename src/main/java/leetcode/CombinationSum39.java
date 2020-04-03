package main.java.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-3 上午8:21
 * <p>
 * 类说明：
 */
public class CombinationSum39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backTrace(candidates,0,target,res,new ArrayList<>());
        return res;
    }

    private void backTrace(int[] nums, int s ,int target, List<List<Integer>> res, List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum+=i;
        }
        if (sum >= target){
            if (sum == target) {
                res.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i= s;i<nums.length;i++) {
            list.add(nums[i]);
            backTrace(nums,i,target,res,list);
            list.remove(list.size() - 1);
        }
    }
}
