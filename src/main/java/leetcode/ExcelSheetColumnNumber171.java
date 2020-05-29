package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-28 上午11:15
 * <p>
 * 类说明：
 */
public class ExcelSheetColumnNumber171 {
    public int titleToNumber(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int cur = s.charAt(i)-'A'+1;
            res =res*26+ cur;
        }
        return res;
    }
}
