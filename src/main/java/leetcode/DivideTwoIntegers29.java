package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-27 下午4:19
 * <p>
 * 类说明：
 */
public class DivideTwoIntegers29 {
    public int divide(int dividend, int divisor) {
        return solution1(dividend, divisor);
    }

    /**
     * 递归　逐步增加相减
     * @param dividend
     * @param divisor
     * @return
     */
    private int solution1(int dividend, int divisor) {
        int symbol = -1;
        int res = -1;
        if ((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0)) {
            symbol = 1;
        }
        dividend = dividend<0?dividend:opposite(dividend);
        divisor = divisor<0?divisor:opposite(divisor);
        if(dividend>divisor){
            return 0;
        }
        int end = dividend;
        int sor = divisor;
        dividend -=divisor;
        while (dividend<0&&dividend<=divisor) {
            res = res+res;
            divisor += divisor;
            dividend -=divisor;
        }
        res = res + opposite(solution1(end-divisor, sor));
        if(res == Integer.MIN_VALUE){
            if (symbol == -1){
                return res;
            }else{
                return Integer.MAX_VALUE;
            }
        }else {
            return symbol==-1?res:opposite(res);
        }
    }

    private int opposite(int x) {
        return ~x+1;
    }
}
