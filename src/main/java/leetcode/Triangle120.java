package main.java.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-24 下午6:18
 * <p>
 * 类说明：
 */
public class Triangle120 {
    int res = Integer.MAX_VALUE;
    public int minimumTotal(List<List<Integer>> triangle) {
       return solution2(triangle);
    }

    public int minimumTotal1(List<List<Integer>> triangle) {
        int rows = triangle.size();
        int cols = triangle.get(rows - 1).size();
        int[][] dp = new int[rows][cols];
        dp[0][0] = triangle.get(0).get(0);
        for (int row = 1; row < rows; row++) {
            List<Integer> curRow = triangle.get(row);
            int col = 0;
            dp[row][col] = dp[row - 1][col] + curRow.get(col);
            col++;
            for (; col < curRow.size() - 1; col++) {
                dp[row][col] = Math.min(dp[row - 1][col - 1], dp[row - 1][col]) + curRow.get(col);
            }
            dp[row][col] = dp[row - 1][col - 1] + curRow.get(col);
        }
        int min = Integer.MAX_VALUE;
        for (int col = 0; col < cols; col++) {
            min = Math.min(min, dp[rows - 1][col]);
        }
        return min;
    }


    /**
     * time limit
     * @param triangle
     * @return
     */
    private int solution1(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        trace1(0,0,0,triangle);
        return res;
    }

    private int solution2(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        trace2(0,0,0,triangle,"",new HashMap<String,Integer>());
        return res;
    }

    private void trace2(int sum, int index, int cur, List<List<Integer>> triangle, String s, Map<String, Integer> map) {
        if (index == triangle.size()) {
            res = Math.min(res, sum);
            return;
        }
        if (map.containsKey(s)) {
            sum = map.get(s);
        }else{
            List<Integer> list = triangle.get(index);
            sum += list.get(cur);
            map.put(s +"@"+ cur, sum);
        }
        trace2(sum, index + 1, cur, triangle,s +"@"+ cur,map);
        trace2(sum, index + 1, cur+1, triangle,s +"@"+ cur,map);
    }
    private void trace1(int sum, int index,  int cur,List<List<Integer>> triangle) {
        if (index == triangle.size()) {
            res = Math.min(res, sum);
            return;
        }
        List<Integer> list = triangle.get(index);
        sum += list.get(cur);
        trace1(sum, index + 1, cur, triangle);
        trace1(sum, index + 1, cur+1, triangle);
    }

}
