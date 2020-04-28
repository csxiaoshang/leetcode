package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-28 上午8:39
 * <p>
 * 类说明：
 */
public class HouseRobber198 {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int[] res = new int[len];
        res[0] = nums[0];
        int max = res[0];
        for (int i = 1; i < len; i++) {
            int tem = 0;
            for (int j = 0; j < i - 1; j++) {
                tem = Math.max(res[j], tem);
            }
            res[i] = tem + nums[i];
            max = Math.max(res[i], max);
        }
        return max;
    }
}
