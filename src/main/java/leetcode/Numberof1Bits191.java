package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-30 下午11:36
 * <p>
 * 类说明：
 */
public class Numberof1Bits191 {
    public int hammingWeight(int n) {
        int res = 0;
        int count = 0;
        while (count++ < 32) {
            if ((n & 1) == 1) {
                res++;
            }
            n = n>>1;
        }
        return res;
    }
}
