package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-19 上午11:16
 * <p>
 * 类说明：
 */
public class Combinations77 {
    public List<List<Integer>> combine(int n, int k) {
        return solution1(n, k);
    }

    private List<List<Integer>> solution1(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i+1;
        }
        backTrace(nums,res, new ArrayList<>(), 0,k);
        return res;
    }

    private void backTrace(int[] nums,List<List<Integer>> res, List<Integer> list, int s,int k) {
        if (list.size() == k) {
            res.add(list);
            return ;
        }
        for(int i=s;i<nums.length -(k-list.size())+1;i++){
            list.add(nums[i]);
            backTrace(nums,res,new ArrayList<>(list),i+1,k);
            list.remove(list.size() - 1);
        }
    }
}
