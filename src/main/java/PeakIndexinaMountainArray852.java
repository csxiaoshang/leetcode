package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-1-1 下午7:11
 * <p>
 * 类说明：
 */
public class PeakIndexinaMountainArray852 {
    public int peakIndexInMountainArray(int[] A) {
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] > A[i]) {
                return i - 1;
            }
        }
        return 0;
    }
}
