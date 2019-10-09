package main.java.crackingtheCodingInterview;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-10-9 下午6:19
 * <p>
 * 类说明：
 */
public class GoUpstairs {
    public int countWays(int n) {
        // write code here
        int a =1,b=2,c=4;
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return a;
        }
        if (n == 2) {
            return b;
        }
        if (n == 3) {
            return c;
        }
        for (int i = 4; i <=n; i++) {
            int tem = ((a + b) % 1000000007 + c) % 1000000007;
            a=b;
            b=c;
            c=tem;
        }
        return c;
    }
}
