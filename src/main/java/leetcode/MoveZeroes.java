package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-4 下午6:09
 * <p>
 * 类说明：
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        for (int l = 0, r = 0;r<len;r++ ) {
            if (nums[r] != 0) {
                int tem = nums[r];
                nums[r] = nums[l];
                nums[l] = tem;
                l++;
            }
        }
    }
}
