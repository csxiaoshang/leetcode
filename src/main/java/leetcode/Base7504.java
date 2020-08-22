package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-16 上午10:51
 * <p>
 * 类说明：
 */
public class Base7504 {
    public static void main(String[] args) {
        System.out.println(Boolean.TRUE.equals(false));
    }
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        int symbol = num >= 0 ? 1 : -1;
        num = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int c = num %7;
            sb.append(c);
            num = num / 7;
        }
        if (symbol == -1) {
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}
