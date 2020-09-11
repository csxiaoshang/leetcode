package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-9-11 上午11:37
 * <p>
 * 类说明：
 * The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.
 *
 *
 *
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 *
 * Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.
 *
 * Example:
 *
 * Input: 4
 * Output: [
 *  [".Q..",  // Solution 1
 *   "...Q",
 *   "Q...",
 *   "..Q."],
 *
 *  ["..Q.",  // Solution 2
 *   "Q...",
 *   "...Q",
 *   ".Q.."]
 * ]
 * Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above.
 */
public class NQueens51 {
    public static void main(String[] args) {
        int n = 4;
        NQueens51 nQueens51 = new NQueens51();
        List<List<String>> res = nQueens51.solveNQueens(n);
        String s = "ASDF";
        System.out.println(s.substring(0,2)+"C"+s.substring(3));
        System.out.println(res);
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
            List<String> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < n; k++) {
                    sb.append(".");
                }
                list.add(sb.toString());
            }
        backTrace(n, res, list, 0);
        return res;
    }

    private void backTrace(int n, List<List<String>> res, List<String> list, int level) {
        if (level >= n) {
            res.add(new ArrayList<>(list));
            return;
        }

        String s = list.get(level);
        for (int i = 0; i < n; i++) {
            if (isValid(list, level, i, n)) {
                continue;
            }
            list.set(level, s.substring(0,i)+"Q"+s.substring(i+1));
            backTrace(n, res, list, level+1);
            list.set(level, s);
        }
    }

    private boolean isValid(List<String> list, int row, int col, int n) {

        for (int i = 0; i < n; i++) {
            if (list.get(i).charAt(col) == 'Q') {
                return true;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (list.get(i).charAt(j) == 'Q') {
                return true;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (list.get(i).charAt(j) == 'Q') {
                return true;
            }
        }
        return false;
    }
}
