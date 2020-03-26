package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-23 下午9:42
 * <p>
 * 类说明：
 */
public class PowXy50 {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        if(n == Integer.MIN_VALUE){
            n = n+2;
        }
        if(n<0){
            n = -n;
            x = 1/x;
        }
        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
}
