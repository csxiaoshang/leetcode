package main.java.crackingtheCodingInterview;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-9-16 下午8:34
 * <p>
 * 类说明：
 */
public class BinInsert {

    public int binInsert(int n, int m, int j, int i) {
        // write code here
        int mid = getMid2(n, j, i);
        int mTmp = m << j;
        return mid | mTmp;
    }

    private int getMid2(int data,int j,int i){
        int tmp = (int) (Math.pow(2,i-j+1)-1);
        return data - (data & tmp << j);
    }
}
