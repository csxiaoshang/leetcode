package main.java.crackingtheCodingInterview;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-10-16 下午9:00
 * <p>
 * 类说明：
 */
public class Robot2 {
    public int countWays(int[][] map, int x, int y) {
        // write code here
        int res[][] = new int[x][y];
        for (int i = 0; i < x; i++) {
            if (map[i][0] == 0) {
                continue;
            }
            if (i == 0){
                res[i][0] = 1;
            }else {
                res[i][0] = res[i - 1][0];
            }

        }
        for (int i = 0; i < y; i++) {
            if (map[0][i] == 0) {
                continue;
            }
            if (i == 0){
                res[0][i] = 1;
            }else {
                res[0][i] = res[0][i - 1];
            }
        }
        for (int i = 1; i < x; i++) {
            for (int j = 1; j < y; j++) {
                if (map[i][j] == 0){
                    res[i][j] = 0;
                }else {
                    res[i][j] = res[i - 1][j] + res[i][j - 1];
                }
            }
        }
        return res[x-1][y-1];
    }
}
