package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-17 上午9:35
 * <p>
 * 类说明：
 */
public class AddStrings415 {
    public String addStrings(String num1, String num2) {
        int sum = 0;
        int carry = 0;
        int l = num1.length() - 1;
        int r = num2.length() - 1;
        String res = "";
        while (l >= 0 || r >= 0) {
            int x = l < 0 ? 0 : num1.charAt(l--) - '0';
            int y = r < 0 ? 0 : num2.charAt(r--) - '0';
            sum = x + y + carry;
            carry = 0;
            if (sum >= 10) {
                carry = sum /10;
                sum = sum % 10;
            }
            res = sum + res;
        }
        if (carry == 1) {
            res = "1"+res;
        }
        return res;
    }
}
