package main.java.crackingtheCodingInterview;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-11-26 下午3:17
 * <p>
 * 类说明：
 * 维护x的佚
 */
public class Rank {
    public int[] getRankOfNumber(int[] A, int n) {
        // write code here

        /**
         * 复杂度为n^2
         */
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(A[i]>=A[j]){
                    res[i]++;
                }
            }
        }
        return res;

    }
}
