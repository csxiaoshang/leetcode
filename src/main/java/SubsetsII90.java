package main.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-24 下午11:37
 * <p>
 * 类说明：
 */
public class SubsetsII90 {
    public static void main(String[] args) {
        SubsetsII90 sub = new SubsetsII90();
        int[] nums = {4, 4, 4, 1, 4};
        Arrays.sort(nums);
        List<List<Integer>> res =sub.subsetsWithDup(nums);
        System.out.println(res);
    }
    List<List<Integer>> res = new ArrayList<>();
    Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        find(nums, 0, new ArrayList<>());
        return res;
    }

    private void find(int[] nums, int index, List<Integer> list) {
        if(!set.contains(list)){
            res.add(new ArrayList<>(list));
            set.add(list);
        }
        if (index >= nums.length) {
            return;
        }
        for(int i = index;i<nums.length;i++){
            list.add(nums[i]);
            find(nums,i+1,new ArrayList<>(list));
            list.remove(list.size() - 1);
        }
    }
}
