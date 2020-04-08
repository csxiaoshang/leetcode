package main.java.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-7 下午5:41
 * <p>
 * 类说明：
 */
public class CountingElements {
    public int countElements(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            int num = map.getOrDefault(i, 0);
            map.put(i, num + 1);
        }
        int res = 0;
        for (int i: map.keySet()) {
            if (map.containsKey(i+1)){
                res += map.get(i);
            }
        }
        return res;
    }
}
