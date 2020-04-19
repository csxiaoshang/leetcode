package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-19 上午11:03
 * <p>
 * 类说明：
 */
public class Searcha2DMatrix74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int row = 0;
        for (int i = 0; i < n; i++) {
            if (matrix[i][m - 1] > target) {
                row = i;
                break;
            } else if (matrix[i][m - 1] == target) {
                return true;
            }else {
                if (i == n - 1) {
                    return false;
                }
            }
        }
        int l = 0,r = m-1;
        while (l <= r) {
            int mid = l+(r-l)/2;
            if (matrix[row][mid] < target) {
                l = mid+1;
            }else if (matrix[row][mid] > target){
                r = mid - 1;
            }else {
                return true;
            }
        }
        return false;
    }
}
