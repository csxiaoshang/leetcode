package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-9-17 下午11:32
 * <p>
 * 类说明：
 * Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.
 *
 * Example 1:
 * Input:
 *
 * "bbbab"
 * Output:
 * 4
 * One possible longest palindromic subsequence is "bbbb".
 *
 *
 * Example 2:
 * Input:
 *
 * "cbbd"
 * Output:
 * 2
 * One possible longest palindromic subsequence is "bb".
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 1000
 * s consists only of lowercase English letters.
 */
public class LongestPalindromicSubsequence516 {

    public int longestPalindromeSubseq(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }
        int len = s.length();
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;
        }
        for (int i = 1; i < len; i++) {

            for (int j = 0; j + i < len; j++) {
                if(s.charAt(j) == s.charAt(j+i)){
                    dp[j][i+j] = dp[j+1][i+j-1] +2;
                }else{
                    dp[j][i + j] = Math.max(dp[j + 1][i + j], dp[j][i + j - 1]);
                }
            }
        }
        return dp[0][len-1];
    }

    /**
     *　递归超时
     * @param s
     * @param i
     * @param j
     * @return
     */
    private int trace(String s, int i, int j) {

        if (i == j) {
            return 1;
        }
        if (i > j) {
            return 0;
        }
        if (s.charAt(i) == s.charAt(j)) {
            return trace(s,i+1,j-1) + 2;
        }else{
            return Math.max(trace(s, i, j - 1), trace(s, i + 1, j));
        }
    }
}
