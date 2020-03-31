package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-31 上午11:30
 * <p>
 * 类说明：
 */
public class SearchInsertPosition35 {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        for (int i=0;i<len;i++){
            if (nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
}
