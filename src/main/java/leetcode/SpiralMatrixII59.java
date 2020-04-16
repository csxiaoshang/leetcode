package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-15 上午8:32
 * <p>
 * 类说明：
 */
public class SpiralMatrixII59 {
    public int[][] generateMatrix(int n) {
        int[][] nums = new int[n][n];
        int count = 1;
        int level = (n-1)/2+1;
        for (int k = 0; k < level; k++) {
            for (int i = k; i < n-k; i++) {
                nums[k][i] = count++;
            }
            for (int i = k + 1; i < n-k; i++) {
                nums[i][n-1-k] = count++;
            }
            for (int i = n - 2 - k; i >= k; i--) {
                nums[n - 1 - k][i] = count++;
            }
            for (int i = n - 2 - k; i > k ; i--) {
                nums[i][k] = count++;
            }
        }
        return nums;
    }
}
