package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-1-2 上午9:30
 * <p>
 * 类说明：
 */
public class LongestPalindromicSubstring5 {

/**
*@Description: o(n^3)时间复杂度的解法
*@param: s
*@return: java.lang.String
*@Author: ashang
*@date: 20-1-3上午9:52
*/
    public String longestPalindrome(String s) {
        if(s == null || s.length()<2){
            return s;
        }
        int length = s.length();
        for(int len = length;len>=2;len--){
            for(int i=0;i<=length-len;i++){
                int j = i+len-1;
                if(isPalindrome(s,i,j)){
                    return s.substring(i,i+len);
                }
            }
        }
        return s.substring(0,1);
    }

    /**
     * dp
     * @param s
     * @return
     */
    private String solution1(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        String res = s.substring(0, 1);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) && (dp[i+1][j-1] >0 || j == i+1) ){
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                    if (j - i + 1 > res.length()) {
                        res = s.substring(i, j-i+1);
                    }
                }
            }
        }
        return res;
    }

    private boolean isPalindrome(String s,int left,int right){
        while(left<right){
            if(left>=0&&right<s.length()&&s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}
