package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-1-20 下午6:02
 * <p>
 * 类说明：
 */
public class PermutationsII47 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        backTrace(nums,new ArrayList<Integer>(),new ArrayList<Integer>());
        return res;
    }
    private void backTrace(int[] nums,List<Integer> tem,List<Integer> count){
        if(tem.size() == nums.length){
            if(!res.contains(tem)){
                res.add(tem);
            }
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(count.contains(i)){
                continue;
            }
            tem.add(nums[i]);
            count.add(i);
            backTrace(nums,new ArrayList<Integer>(tem),new ArrayList<Integer>(count));
            tem.remove(tem.size()-1);
            count.remove(count.size()-1);
        }
    }
}
