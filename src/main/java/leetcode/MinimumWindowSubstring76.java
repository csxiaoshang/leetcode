package main.java.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 北集
 * @Date 2020/6/15 16:59
 * @Description: Given a string S and a string T, find the minimum window in S which will contain all the characters in
 * T in complexity O(n).
 *
 * Example:
 *
 * Input: S = "ADOBECODEBANC", T = "ABC"
 * Output: "BANC"
 * Note:
 *
 * If there is no such window in S that covers all characters in T, return the empty string "".
 * If there is such window, you are guaranteed that there will always be only one unique minimum window in S.
 */
public class MinimumWindowSubstring76 {
    public static void main(String[] args) {
        MinimumWindowSubstring76 m = new MinimumWindowSubstring76();
        System.out.println(m.minWindow("acbbaca",
            "aba"));
    }

    public String minWindow(String s, String t) {
        if (s == null || s.length() == 0 || s.length() < t.length()) {
            return "";
        }
        int sLen = s.length();
        int tLen = t.length();
        int l = 0;
        int r = 0;
        int count = 0;
        int lRes = 0;
        int rRes = -1;
        int countRes = Integer.MAX_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        while (r < sLen) {
            char cur = s.charAt(r);
            if (!map.containsKey(cur)) {
                r++;
                continue;
            }
            map.put(cur, map.get(cur) - 1);
            while (match(map)) {
                 count = r - l + 1;
                if (count < countRes) {
                    countRes = count;
                    rRes = r;
                    lRes = l;
                }
                char pre = s.charAt(l);
                if (map.containsKey(pre)){
                    map.put(pre, map.get(pre) + 1);
                }
                l++;
            }
            r++;
        }
        return s.substring(lRes, rRes+1);
    }

    private boolean match(Map<Character, Integer> map) {
        for (Integer i : map.values()) {
            if (i > 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 暴力超时
     */
    class solution1 {
        public String minWindow(String s, String t) {
            if (s == null || s.length() == 0 || s.length() < t.length()) {
                return "";
            }
            int sLen = s.length();
            int tLen = t.length();
            Map<Character, Integer> map = new HashMap<>();
            for (char c : t.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            for (int k = tLen; k <= sLen; k++) {
                for (int i = 0; i < sLen - k + 1; i++) {
                    int count = 0;
                    for (int j = i; j < i + k; j++) {
                        char cur = s.charAt(j);
                        if (map.containsKey(cur) && map.get(cur) >= 1) {
                            map.put(cur, map.get(cur) - 1);
                            count++;
                        }
                    }
                    if (count == tLen) {
                        return s.substring(i, i + k);
                    }
                    for (char c : t.toCharArray()) {
                        map.put(c, 0);
                    }
                    for (char c : t.toCharArray()) {
                        map.put(c, map.getOrDefault(c, 0) + 1);
                    }
                }
            }
            return "";
        }
    }
}
