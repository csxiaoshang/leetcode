package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-30 下午11:16
 * <p>
 * 类说明：
 */
public class ReverseBits190 {

    public int reverseBits(int n) {
        int res = 0;
        int count = 0;
        while (count++<32) {
            int cur = n &1;
            n = n>>1;
            res = res<<1 | cur;
        }
        return res;
    }
}
