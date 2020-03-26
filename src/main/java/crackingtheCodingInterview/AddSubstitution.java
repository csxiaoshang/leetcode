package main.java.crackingtheCodingInterview;

import java.math.BigDecimal;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-9-26 下午8:42
 * <p>
 * 类说明：
 */
public class AddSubstitution {
    public int calc(int a, int b, int type) {
        // write code here
        if (type == 1) {
            return mul(a, b);
        } else if (type == 0) {
            return divide(a, b);
        } else {
            return sub(a, b);
        }
    }

    private int mul(int a, int b) {
        int res = 0;
        while (b>0) {
            res +=a;
            b--;
        }
        return res;
    }

    private int divide(int a, int b) {
        int res = 0;
        int sum = b;
        while (a >= sum) {
            sum += b;
            res++;
        }
        return res;
    }

    private int sub(int a, int b) {
        int res = 0;
        if (a >= b) {
            while (a !=b) {
            b++;
            res++;
        }
        }else {
            while (a != b) {
                b--;
                res--;
            }
        }
        return res;
    }
}
