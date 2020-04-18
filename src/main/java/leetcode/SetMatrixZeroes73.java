package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-18 上午9:51
 * <p>
 * 类说明：
 */
public class SetMatrixZeroes73 {
    public void setZeroes(int[][] matrix) {
         solution1(matrix);
    }

    private void solution1(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] nums = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.arraycopy(matrix[i], 0, nums[i], 0, m);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums[i][j] == 0) {
                    for (int k = 0; k < n; k++) {
                        matrix[k][j] = 0;
                    }
                    for (int k = 0; k < m; k++) {
                        matrix[i][k] = 0;
                    }
                }
            }
        }
    }
}
