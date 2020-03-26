package main.java.crackingtheCodingInterview;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-10-17 下午9:29
 * <p>
 * 类说明：
 */
public class MagicIndex2 {
    public boolean findMagicIndex(int[] A, int n) {
        // write code here
        for (int i = 0; i < n;i++) {
            if (A[i] == i) {
                return true;
            }
            if (A[i] < i) {
                continue;
            }
            i=A[i]-1;
        }
        return false;
    }
}
