package main.java.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-6-8 下午8:16
 * <p>
 * 类说明：
 * TODO
 * Share
 * Remove the minimum number of invalid parentheses in order to make the input string valid. Return all possible
 * results.
 *
 * Note: The input string may contain letters other than the parentheses ( and ).
 *
 * Example 1:
 *
 * Input: "()())()"
 * Output: ["()()()", "(())()"]
 * Example 2:
 *
 * Input: "(a)())()"
 * Output: ["(a)()()", "(a())()"]
 * Example 3:
 *
 * Input: ")("
 * Output: [""]
 */
public class RemoveInvalidParentheses301 {
    public List<String> removeInvalidParentheses(String s) {
        Map<Integer, List<String>> res = new HashMap<>();
        if (s == null || s.length() == 0) {
            return new ArrayList<>();
        }
        backTrace(0, 0, res, s);
        for (int i = 0; i < s.length(); i++) {
            if (res.containsKey(i)) {
                return res.get(i);
            }
        }
        return new ArrayList<>();
    }

    private void backTrace(int step, int index, Map<Integer, List<String>> res, String s) {
        if (index == s.length()) {
            if (!isValid(s)) {
                return;
            }
            if (res.containsKey(step)) {
                res.get(step).add(new String(s));
            } else {
                List<String> list = new ArrayList<>();
                list.add(new String(s));
                res.put(step, list);
            }
            return;
        }

        for (int i = index; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '(' && c != ')') {
                continue;
            }
            String cur = s.substring(0, i) + s.substring(i + 1);
            backTrace(step + 1, index + 1, res, cur);
        }
    }

    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(chars[i]);
            } else if (chars[i] == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();

                }
            }
        }
        return stack.isEmpty() ? true : false;
    }

    /**
     * bfs
     */
    class Solution1{
        public List<String> removeInvalidParentheses(String s) {
            LinkedList<String> queue = new LinkedList<>();
            HashSet<String> set = new HashSet<>();
            List<String> res = new ArrayList<>();
            queue.offer(s);
            boolean isValid = false;
            while (!queue.isEmpty()) {
                String cur = queue.poll();
                if (isValidCount(cur)) {
                    res.add(cur);
                    isValid = true;
                }
                if (isValid) {
                    continue;
                }
                for (int i = 0; i < cur.length(); i++) {
                    if (cur.charAt(i) != '(' || cur.charAt(i) != ')') {
                        continue;
                    }
                    String str = cur.substring(0, i) + cur.substring(i + 1);
                    if (!set.contains(str)) {
                        queue.offer(str);
                        set.add(str);
                    }
                }
            }
            return res;
        }
        private boolean isValidCount(String s) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    count++;
                } else if (s.charAt(i) == ')') {
                    count--;
                }
                if (count < 0) {
                    return false;
                }
            }
            return count == 0;
        }
    }
}
