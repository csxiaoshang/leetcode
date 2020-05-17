package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-16 上午11:16
 * <p>
 * 类说明：
 */
public class ExcelColumnTitle168 {
    public String convertToTitle(int n) {
        if (n == 0) {
            return "";
        }
        n--;
        return convertToTitle(n / 26) + (char) (n % 26 + 'A');
    }
}
