package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-1-21 下午2:38
 * <p>
 * 类说明：
 */
public class RotateImage48 {
    /**
     * 空间复杂度 o(n^2)
     *
     * @param matrix
     */
    public void rotate1(int[][] matrix) {
        int length = matrix.length;
        int[][] res = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                res[j][length - 1 - i] = matrix[i][j];
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = res[i][j];
            }
        }
    }

    /**
     * 空间复杂度为o(1)
     *
     * @param matrix
     */
    public void rotate2(int[][] matrix) {
        int length = matrix.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int tem = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tem;
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length / 2; j++) {
                int tem = matrix[i][j];
                matrix[i][j] = matrix[i][length - 1 - j];
                matrix[i][length - 1 - j] = tem;
            }
        }
    }
}
