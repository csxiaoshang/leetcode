package main.java.crackingtheCodingInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Arrays;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-11-14 下午8:44
 * <p>
 * 类说明：
 */
public class SortString {
    public ArrayList<String> sortStrings(String[] str, int n) {
        // write code here
        ArrayList<String> res = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char[] chars = str[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            String value = map.get(key);
            if (value == null || value.compareTo(str[i]) > 0) {
                map.put(key, str[i]);
            }
        }
        res.addAll(map.values());
        Collections.sort(res);
        return res;
    }
}
