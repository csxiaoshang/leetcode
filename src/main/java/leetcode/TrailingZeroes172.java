package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-16 上午11:59
 * <p>
 * 类说明：
 */
public class TrailingZeroes172 {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(13));
    }
    public static int trailingZeroes(int n) {
        return n == 0?0:n/5+trailingZeroes(n/5);
    }
}
