package main.java.crackingtheCodingInterview;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-9-18 下午7:20
 * <p>
 * 类说明：
 */
public class CloseNumber {
    public int[] getCloseNumber(int x) {
        // write code here
        int tem =x;
        int c0 = 0;
        int c1 = 0;
        int[] res = new int[2];
        while ((tem & 1) == 1) {
            c1++;
            tem >>= 1;
        }
            res[0] = getPre(x);
        res[1] = getNext(x);
        return res;
    }
    private int getPre(int x) {
        int tem = x;
        int c1 =0;
        int c0 =0;
        while ((tem & 1) == 1) {
            c1++;
            tem >>= 1;
        }
        while ((tem & 1) == 0) {
            c0++;
            tem >>= 1;
        }
        return x- (1 << c1) - (1 << (c0 -1)) + 1;
    }

    private int getNext(int x){
        int tem = x;
        int c1 =0;
        int c0 =0;
        while ((tem & 1) == 0) {
            c0++;
            tem >>= 1;
        }
        while ((tem & 1) == 1) {
            c1++;
            tem >>= 1;
        }
        return x + (1 << c0) + (1 << (c1 -1 )) - 1;
    }
}
