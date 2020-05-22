package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-22 上午9:58
 * <p>
 * 类说明：
 */
public class TrappingRainWater42 {
    public int trap(int[] height) {
        return solution1(height);
    }

    private int solution1(int[] height) {
        int sum = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int left = 0;
            for (int j = i - 1; j >= 0; j--) {
                left = Math.max(left, height[j]);
            }
            int right = 0;
            for (int j = i + 1; j < height.length; j++) {
                right = Math.max(right, height[j]);
            }
            int h = Math.min(left, right);
            if (h > height[i]) {
                sum += h - height[i];
            }
        }
        return sum;
    }
}
