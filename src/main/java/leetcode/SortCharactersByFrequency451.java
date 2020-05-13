package main.java.leetcode;

import java.util.*;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-13 上午11:20
 * <p>
 * 类说明：
 */
public class SortCharactersByFrequency451 {
    public String frequencySort(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Character>[] bucket = new ArrayList[s.length() + 1];
        for (char c : map.keySet()) {
            int index = map.get(c);
            if (bucket[index] == null) {
                bucket[index] = new ArrayList<>();
            }
            bucket[index].add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() ; i >= 0; i--) {
            if (bucket[i] == null) {
                continue;
            }
            for (char c : bucket[i]) {
                for (int k = 0; k < i; k++) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
