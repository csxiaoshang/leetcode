package main.java.leetcode;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-31 上午10:57
 * <p>
 * 类说明： todo
 */
public class PermutationsII47II {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backTrace(nums,res,new ArrayList<>());
        return res;
    }

    private void backTrace(int[] nums, List<List<Integer>> res, List<Integer> list) {
        if (list.size() == nums.length) {
            if (!res.contains(list)){
                res.add(list);
            }
        }else {
            for (int i =0;i<nums.length;i++){
                if (list.contains(nums[i])){
                    continue;
                }
                list.add(nums[i]);
                backTrace(nums,res,new ArrayList<>(list));
                list.remove(list.size() - 1);
            }
        }
    }
}
