package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-14 下午6:40
 * <p>
 * 类说明：
 */
public class DifferentWaystoAddParentheses241 {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<>();
        if (input == null || input.length() == 0) {
            return res;
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (isOperate(c)) {
                List<Integer> left = diffWaysToCompute(input.substring(0, i));
                List<Integer> right = diffWaysToCompute(input.substring(i+1));
                for (int l : left) {
                    for (int r : right) {
                        res.add(caculate(l, c, r));
                    }
                }
            }
        }
        if (res.size() == 0) {
            res.add(Integer.valueOf(input));
        }
        return res;
    }

    private boolean isOperate(char c) {
        if (c == '-' || c == '+' || c == '*') {
            return true;
        }else {
            return false;
        }
    }

    private int caculate(int num1, char c, int num2) {
        switch (c) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
        }
        return -1;
    }
}
