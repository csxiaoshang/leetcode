package main.java.leetcode;

/**
 * @Author 北集
 * @Date 2020/6/17 20:07
 * @Description:
 * Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.
 *
 * Example:
 *
 * Input:
 * [
 *   ["1","0","1","0","0"],
 *   ["1","0","1","1","1"],
 *   ["1","1","1","1","1"],
 *   ["1","0","0","1","0"]
 * ]
 * Output: 6
 *
 * 太难了
 */
public class MaximalRectangle85 {
    public int maximalRectangle(char[][] matrix) {
        return 0;
    }

    /**
     * 暴力解法　success
     */
    class Solution1{
        public int maximalRectangle(char[][] matrix) {
            int maxArea = 0;
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return maxArea;
            }
            int m = matrix.length;
            int n = matrix[0].length;
            int[][] num = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == '1') {
                        if (j == 0) {
                            num[i][j] = 1;
                        }else{
                            num[i][j] = num[i][j - 1] + 1;
                        }
                    }else{
                        num[i][j] = 0;
                    }

                    int minWith = num[i][j];
                    for (int k = i; k >= 0; k--) {
                        int height = i-k+1;
                        minWith = Math.min(minWith, num[k][j]);
                        maxArea = Math.max(maxArea, height * minWith);
                    }
                }
            }
            return maxArea;
        }
    }
    class Solution2{
        public int maximalRectangle(char[][] matrix) {

        }
    }
}
