package main.java.crackingtheCodingInterview;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-10-15 下午10:01
 * <p>
 * 类说明：
 */
public class Robot {
    public int countWays(int x, int y) {
        // write code here
        int res[][] = new int[12][12];
        for (int i = 1; i < 12; i++) {
            res[1][i]=1;
            res[i][1]=1;
        }
        for (int i = 2; i < 12; i++) {
            for (int j = 2; j < 12; j++) {
                res[i][j] = res[i - 1][j] + res[i][j - 1];
            }
        }
        return res[x][y];
    }
}
