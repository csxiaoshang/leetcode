package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-17 上午10:17
 * <p>
 * 类说明：
 */
public class ValidPerfectSquare367 {
    public boolean isPerfectSquare(int num) {
        int subNum = 1;
        while (num > 0) {
            num -= subNum;
            subNum += 2;
        }
        return num == 0;
    }
}
