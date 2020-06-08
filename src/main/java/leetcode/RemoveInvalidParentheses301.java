package main.java.leetcode;

import java.util.*;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-6-8 下午8:16
 * <p>
 * 类说明：
 * TODO
 */
public class RemoveInvalidParentheses301 {
    public List<String> removeInvalidParentheses(String s) {
        Map<Integer, List<String>> res = new HashMap<>();
        if (s == null || s.length() == 0) {
            return new ArrayList<>();
        }
        backTrace(0,0,res,s);
        for (int i = 0; i < s.length(); i++) {
            if (res.containsKey(i)) {
                return res.get(i);
            }
        }
        return new ArrayList<>();
    }

    private void backTrace(int step, int index,Map<Integer, List<String>> res, String s) {
        if (index == s.length()) {
            if (res.containsKey(step)) {
                res.get(step).add(new String(s));
            }else{
                List<String> list = new ArrayList<>();
                list.add(new String(s));
                res.put(step, list);
            }
            return;
        }

        for (int i = index; i < s.length(); i++) {
            String cur = s.substring(0, i) + s.substring(i + 1);
            backTrace(step + 1, index + 1, res, cur);
        }
    }

    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

    }
}
