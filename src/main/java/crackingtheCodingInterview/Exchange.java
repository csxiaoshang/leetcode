package main.java.crackingtheCodingInterview;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-9-19 下午8:03
 * <p>
 * 类说明：
 */
public class Exchange {
    public int exchangeOddEven(int x) {
        // write code here
        return ((x & 0xaaaaaaaa) >> 1) | ((x & 0x55555555) << 1);
    }
}
