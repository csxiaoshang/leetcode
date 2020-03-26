package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-24 下午11:15
 * <p>
 * 类说明： 回溯方式
 */
public class Subsets78 {
    List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Subsets78 sub = new Subsets78();
        List<List<Integer>> r =  sub.subsets(nums);
        System.out.println(r);
    }
    public List<List<Integer>> subsets(int[] nums) {
        find(nums, 0, new ArrayList<>());
        return res;
    }

    void find(int[] nums, int index, List<Integer> list) {
        ArrayList<Integer> tem = new ArrayList<>(list);
        res.add(list);
        if (index >= nums.length) {
            return;
        }
        for (int i = index; i < nums.length; i++) {
            tem.add(nums[i]);
            find(nums, i + 1, tem);
        }
    }
}
