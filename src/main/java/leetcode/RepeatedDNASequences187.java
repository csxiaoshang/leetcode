package main.java.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-30 下午10:46
 * <p>
 * 类说明：
 */
public class RepeatedDNASequences187 {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        Set<String> res = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String cur = s.substring(i, i + 10);
            if (set.contains(cur)) {
                res.add(cur);
            }else {
                set.add(cur);
            }
        }
        return new ArrayList<>(res);
    }
}
