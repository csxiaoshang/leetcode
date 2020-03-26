package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-1-19 上午10:28
 * <p>
 * 类说明：
 */
public class Permutations46 {

    /**
     * 回溯方式解决全排列问题
     */
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        backTrace(nums, new ArrayList<Integer>());
        return res;
    }

    private void backTrace(int[] nums, List<Integer> tem) {
        if (tem.size() == nums.length) {
            res.add(tem);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (tem.contains(nums[i])) {
                continue;
            }
            tem.add(nums[i]);
            backTrace(nums, new ArrayList<>(tem));
            tem.remove(tem.size() - 1);
        }
    }
}
