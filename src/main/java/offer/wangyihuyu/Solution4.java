package main.java.offer.wangyihuyu;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-11 下午7:58
 * <p>
 * 类说明：
 * ac
 */
public class Solution4 {
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        int[][] boxes = new int[][]{{5,4,3},{2,3,5},{5,4,2},{6,6,6}};
        System.out.println(s.maxBoxes(boxes));
    }

    public int maxBoxes (int[][] boxes) {
        // write code here
        if (boxes == null || boxes.length == 0 || boxes[0].length == 0) {
            return 0;
        }
        Arrays.sort(boxes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int n = o1.length;
                for (int i = 0; i < n; i++) {
                    if (o1[i] == o2[i]){
                        continue;
                    }
                    return o1[i] - o2[i];
                }
                return o1[0] - o2[0];
            }
        });
        int n = boxes.length;
        int m = boxes[0].length;
/*        System.out.println("n "+n);
        System.out.println("m "+m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(boxes[i][j]);
            }
            System.out.println(" ");
        }*/
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (boxes[i][0]>boxes[j][0]
                        && boxes[i][1]>boxes[j][1]
                        && boxes[i][2]>boxes[j][2] ){
                    int cur = dp[j] +1;
                    max = Math.max(max, cur);
                }
            }
            dp[i] = max;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
