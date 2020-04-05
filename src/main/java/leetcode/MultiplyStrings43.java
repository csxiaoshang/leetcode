package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-3 上午11:14
 * <p>
 * 类说明：
 */
public class MultiplyStrings43 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        String ans = "0";
        int index = 0; //记录当前是哪一位，便于后边补 0
        for (int i = num2.length() - 1; i >= 0; i--) {
            int carry = 0; //保存进位
            String ans_part = ""; //直接用字符串保存每位乘出来的数
            int m = num2.charAt(i) - '0';
            //乘上每一位
            for (int j = num1.length() - 1; j >= 0; j--) {
                int n = num1.charAt(j) - '0';
                int mul = m * n + carry;
                ans_part = mul % 10 + "" + ans_part;
                carry = mul / 10;
            }
            if (carry > 0) {
                ans_part = carry + "" + ans_part;
            }
            //补 0
            for (int k = 0; k < index; k++) {
                ans_part = ans_part + "0";
            }
            index++;
            //和之前的结果相加
            ans = sumString(ans, ans_part);
        }
        return ans;
    }
    //大数相加
    private String sumString(String num1, String num2) {
        int carry = 0;
        int num1_index = num1.length() - 1;
        int num2_index = num2.length() - 1;
        String ans = "";
        while (num1_index >= 0 || num2_index >= 0) {
            int n1 = num1_index >= 0 ? num1.charAt(num1_index) - '0' : 0;
            int n2 = num2_index >= 0 ? num2.charAt(num2_index) - '0' : 0;
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            ans = sum % 10 + "" + ans;
            num1_index--;
            num2_index--;
        }
        if (carry > 0) {
            ans = carry + "" + ans;
        }
        return ans;
    }

}
