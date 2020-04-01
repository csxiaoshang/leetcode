package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-1 下午8:45
 * <p>
 * 类说明：
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int res  = 0;
        for (int i : nums) {
        res = i ^ res;
        }
        return res;
    }
}
