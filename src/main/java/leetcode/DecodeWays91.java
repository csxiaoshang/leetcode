package main.java.leetcode;

import java.util.HashMap;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-18 下午5:19
 * <p>
 * 类说明：
 */
public class DecodeWays91 {
    HashMap<Integer, Integer> map = new HashMap<>();
    public int numDecodings(String s) {
        return solution1(s);
    }

    /**
     * error
     * @param s
     * @return
     */
    private int solution1(String s) {
        int n = s.length();
        int[] nums = new int[n+1];
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        nums[1] = 1;
        nums[2] = 2;
        for (int i = 3; i <= n; i++) {
            if (nums[i] <= 6) {
                nums[i] = nums[i - 1] + nums[i - 2];
            }else{
                nums[i] = nums[i-1];
            }
        }
        return nums[n];
    }

    /**
     * 递归解决方案
     * @param s
     * @param start
     * @return
     */
    private int recursive(String s,int start) {
        if (start == s.length()) {
            return 1;
        }
        if (s.charAt(start) == '0'){
            return 0;
        }
        int ans1 = recursive(s, start + 1);
        int ans2 = 0;
        if (start < s.length() - 1) {
            int ten = s.charAt(start)-'0';
            int one = s.charAt(start + 1) - '0';
            if (ten*10 + one <= 26) {
                ans2 = recursive(s, start + 2);
            }
        }
        return ans1 + ans2;
    }

    /**
     * 带有记忆的递归
     * @param s
     * @param start
     * @return
     */
    private int recursiveMemo(String s, int start) {
        if (start == s.length()) {
            return 1;
        }
        if (map.containsKey(start)) {
            return map.get(start);
        }
        if (s.charAt(start) == '0'){
            return 0;
        }
        int ans1 = recursive(s, start + 1);
        int ans2 = 0;
        if (start < s.length() - 1) {
            int ten = s.charAt(start)-'0';
            int one = s.charAt(start + 1) - '0';
            if (ten*10 + one <= 26) {
                ans2 = recursive(s, start + 2);
            }
        }
        map.put(start, ans1 + ans2);
        return ans1 + ans2;
    }
}
