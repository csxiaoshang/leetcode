package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-31 上午10:43
 * <p>
 * 类说明：
 */
public class Permutations46II {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        trace(nums,res,new ArrayList<>());
        return res;
    }
    private void trace(int[] nums,List<List<Integer>> res,List<Integer> list){
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0;i<nums.length;i++){
            if (list.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
            trace(nums,res,list);
            list.remove(list.size() - 1);
        }
    }
}
