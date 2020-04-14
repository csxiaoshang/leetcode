package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-14 上午8:21
 * <p>
 * 类说明：
 */
public class SpiralMatrix54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int level = (Math.min(n,m)-1)/2+1;
        for (int k = 0; k < level; k++) {
            for (int i = k; i < m - k; i++) {
                res.add(matrix[k][i]);
            }
            for (int i = k+1 ; i < n - k; i++) {
                res.add(matrix[i][m - 1 - k]);
            }
            for (int i = m - 2 - k; i >= k && n-k-1 != k; i--) {
                res.add(matrix[n - 1 - k][i]);
            }
            for (int i = n - 2 - k; i > k && m -k -1 != k; i--) {
                res.add(matrix[i][k]);
            }
        }
        return res;
    }
}
