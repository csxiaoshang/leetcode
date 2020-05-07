package main.java.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-6 上午11:42
 * <p>
 * 类说明：
 */
public class FindAllAnagramsinaString438 {
    public List<Integer> findAnagrams(String s, String p) {
        return solution1(s, p);
    }

    private List<Integer> solution1(String s, String p) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < s.length()-p.length()+1; i++) {
            String cur = s.substring(i, i+p.length());
            if (helper(cur, p)) {
                res.add(i);
            }
        }
        return res;
    }

    /**
     * slide window
     * @param s
     * @param p
     * @return
     */
    private List<Integer> solution2(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return res;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            char cur = p.charAt(i);
            map.put(cur, map.getOrDefault(cur, 0) + 1);
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (map.containsKey(cur)) {
                map.put(cur, map.get(cur) - 1);
                if (map.get(cur) == 0) {
                    count++;
                }
            }
            if (i >= p.length()) {
                cur = s.charAt(i - p.length());
                if (map.containsKey(cur)) {
                    map.put(cur, map.get(cur) + 1);
                    if (map.get(cur) == 1) {
                        count--;
                    }
                }
            }
            if (count == map.size()) {
                res.add(i - p.length()+1);
            }
        }
        return res;
    }
    private boolean helper(String cur, String p) {
        if (cur == null || p == null) {
            return false;
        }
        int[] dict = new int[26];
        for (int i = 0; i < cur.length(); i++) {
            dict[cur.charAt(i)-'a']++;
        }
        for (int i = 0; i < p.length(); i++) {
            dict[p.charAt(i) - 'a']--;
            if (dict[p.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
