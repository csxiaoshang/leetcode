package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-7 下午8:12
 * <p>
 * 类说明：
 */
public class PalindromicSubstrings647 {
    int res = 0;
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            helper(s, i, i);
            helper(s, i, i+1);
        }
        return res;
    }

    private void helper(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
            res++;
        }
    }
}
