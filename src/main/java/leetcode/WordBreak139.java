package main.java.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-30 上午10:24
 * <p>
 * 类说明：
 */
public class WordBreak139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        return solution1(s, wordDict);
    }

    /**
     * backtrace with memoization
     * @param s
     * @param wordDict
     * @return
     */
    private boolean solution1(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) {
            return true;
        }
        return backtrace(s, "", wordDict,new HashMap<String,Boolean>());
    }

    /**
     * dp
     * @param s
     * @param wordDict
     * @return
     */
    private boolean solution2(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) {
            return true;
        }
        return dp(s, wordDict);
    }

    private boolean dp(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>();
        set.addAll(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        int n = s.length();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = dp[j] && set.contains(s.substring(j, i));
                if (dp[i]) {
                    break;
                }
            }
        }
        return dp[n];
    }

    private boolean backtrace(String s, String temp, List<String> wordDict, HashMap<String,Boolean> map) {
        if (s.length() == temp.length()) {
            if (s.equals(temp)) {
                return true;
            }else{
                return false;
            }
        }
        if (map.containsKey(temp)) {
            if (map.get(temp)) {
                return true;
            }else{
                return false;
            }
        }
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) != s.charAt(i)) {
                return false;
            }
        }
        if (s.length() < temp.length()) {
            return false;
        }
        for (int i = 0; i < wordDict.size(); i++) {
            int len = temp.length();
            if (backtrace(s, temp + wordDict.get(i), wordDict,map)) {
                map.put(temp,true);
                return true;
            }
        }
        map.put(temp, false);
        return false;
    }
}
