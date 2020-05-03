package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-3 上午10:50
 * <p>
 * 类说明：
 */
public class Searcha2DMatrixII204 {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0
                || matrix[0].length == 0) {
            return false;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            if (target<= matrix[i][m-1]){
                if (search(matrix[i], target)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean search(int[] nums,int target) {
        int n = nums.length;
        int l = 0,r = n-1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target < nums[mid]) {
                r = mid - 1;
            } else if (target > nums[mid]) {
                l = mid +1;
            }else{
                return true;
            }
        }
        return false;
    }
}
