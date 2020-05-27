package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-27 上午11:08
 * <p>
 * 类说明：
 */
public class FindPeakElement162 {
    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            //第一次下降
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }
        //一直上升
        return nums.length - 1;
    }
}
