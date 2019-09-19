package main.java.crackingtheCodingInterview;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-9-19 下午8:00
 * <p>
 * 类说明：
 */
public class TransformdAToB {
    public int calcCost(int A, int B) {
        // write code here
        int tem = A ^ B;
        int count = 0;
        while (tem != 0) {
            if ((tem & 1) == 1) {
                count++;
            }
            tem >>= 1;
        }
        return count;
    }
}
