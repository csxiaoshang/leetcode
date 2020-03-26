package main.java.crackingtheCodingInterview;

import java.util.Stack;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-10-22 下午8:31
 * <p>
 * 类说明：
 */
public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        Stack<Character> stack = new Stack<>();
        char[] c = A.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(') {
                stack.push(c[i]);
            } else if (c[i] == ')') {
                if (stack.empty()){
                    return false;
                }else {
                    stack.pop();
                }
            }
        }
        return stack.empty();
    }
}
