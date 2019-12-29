package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-12-29 下午4:43
 * <p>
 * 类说明：
 */
public class NonDecreasingArray665 {
    public boolean checkPossibility(int[] nums) {
        if (null == nums || nums.length == 0)
            return false;
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                if (i < 2 || nums[i - 2] <= nums[i]) {
                    nums[i - 1] = nums[i];
                } else {
                    nums[i] = nums[i - 1];
                }
                res++;
            }
        }
        return res <= 1;
    }
}
