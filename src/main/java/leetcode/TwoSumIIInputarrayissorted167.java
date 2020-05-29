package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-28 上午10:37
 * <p>
 * 类说明：
 */
public class TwoSumIIInputarrayissorted167 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0,r = numbers.length-1;
        while (l < r) {
            if (target == numbers[l] + numbers[r]) {
                return new int[]{l, r};
            } else if (target > numbers[l] + numbers[r]) {
                l++;
            }else {
                r--;
            }
        }
        return new int[]{l, r};
    }
}
