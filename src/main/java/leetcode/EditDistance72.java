package main.java.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-6-6 下午7:26
 * <p>
 * 类说明： 字符串编辑距离
 *
 * solution:
 * - recursive time limit
 * - recursive with map    ok
 * - dp
 */
public class EditDistance72 {
    Map<String, Integer> map = new HashMap<>();

    /**
     * recursive with map
     * @param word1
     * @param word2
     * @return
     */
    public int minDistance(String word1, String word2) {
        if (word1 == null || word2 == null) {
            return -1;
        }
        if (word1.length() == 0 && word2.length() == 0) {
            return 0;
        }
        if (word1.length() == 0) {
            return word2.length();
        }
        if (word2.length() == 0) {
            return word1.length();
        }
        String key = word1+"#"+word2;
        if (map.containsKey(key)){
            return map.get(key);
        }
        int x = minDistance(word1.substring(0, word1.length() - 1), word2) + 1;
        int y = minDistance(word1, word2.substring(0, word2.length() - 1)) + 1;
        int z = minDistance(word1.substring(0, word1.length() - 1), word2.substring(0, word2.length() - 1));
        if (word1.charAt(word1.length() - 1) != word2.charAt(word2.length() - 1)) {
            z++;
        }
        int res = Math.min(x, Math.min(y, z));
        map.put(key, res);
        return res;
    }
    public int minDistance2(String word1, String word2) {
        if (word1 == null || word2 == null) {
            return -1;
        }
        if (word1.length() == 0 && word2.length() == 0) {
            return 0;
        }
        if (word1.length() == 0) {
            return word2.length();
        }
        if (word2.length() == 0) {
            return word1.length();
        }
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] dict = new int[len1+1][len2+1];
        for (int i = 0; i <= len1; i++) {
            dict[i][0] = i;
        }
        for (int i = 0; i <= len2; i++) {
            dict[0][i] = i;
        }
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                int x = dict[i-1][j]+1;
                int y = dict[i][j-1]+1;
                int z = dict[i - 1][j - 1];
                if (word1.charAt(i - 1) != word2.charAt(j - 1)) {
                    z++;
                }
                dict[i][j] = Math.min(x, Math.min(y, z));
            }
        }
        return dict[len1][len2];
    }

}
