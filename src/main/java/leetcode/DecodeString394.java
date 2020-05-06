package main.java.leetcode;

import java.util.Stack;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-5 上午11:20
 * <p>
 * 类说明：
 */
public class DecodeString394 {
    public String decodeString(String s) {
        String t = "";
            Stack<Integer> s_num = new Stack<>();
            Stack<String> s_str = new Stack<>();;
        char[] ss = s.toCharArray();
            int cnt = 0;
            for (int i = 0; i < s.length(); ++i) {
                if (ss[i] >= '0' && ss[i] <= '9') {
                    cnt = 10 * cnt + ss[i] - '0';
                } else if (ss[i] == '[') {
                    s_num.push(cnt);
                    s_str.push(t);
                    cnt = 0; t= "";
                } else if (ss[i] == ']') {
                    int k = s_num.peek(); s_num.pop();
                    for (int j = 0; j < k; ++j) {
                        String temp = s_str.pop() + t;
                        s_str.push(temp);
                    }
                    t = s_str.peek(); s_str.pop();
                } else {
                    t += ss[i];
                }
            }
            return s_str.empty() ? t : s_str.peek();
        }
}
