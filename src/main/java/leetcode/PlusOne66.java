package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-17 上午9:51
 * <p>
 * 类说明：
 */
public class PlusOne66 {
    public int[] plusOne(int[] digits) {
        //从最低位遍历
        for (int i = digits.length - 1; i >= 0; i--) {
            //小于 9 的话，直接加 1，结束循环
            if (digits[i] < 9) {
                digits[i] += 1;
                break;
            }
            //否则的话置为 0
            digits[i] = 0;
        }
        //最高位如果置为 0 了，说明最高位产生了进位
        if (digits[0] == 0) {
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            digits = ans;
        }
        return digits;
    }

}
