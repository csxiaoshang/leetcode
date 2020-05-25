package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-25 上午7:59
 * <p>
 * 类说明：
 */
public class ValidPalindrome125 {
    public boolean isPalindrome(String s) {
        int len = s.length();
        s = s.toLowerCase(); //统一转为小写
        int i = 0, j = len - 1;
        while (i < j) {
            //跳过非法字符
            while (!isAlphanumeric(s.charAt(i))) {
                i++;
                //匹配 "   " 这样的空白字符串防止越界
                if (i == len) {
                    return true;
                }
            }
            while (!isAlphanumeric(s.charAt(j))) {
                j--;
            }
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private boolean isAlphanumeric(char c) {
        if ('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z' || '0' <= c && c <= '9') {
            return true;
        }
        return false;
    }

}
