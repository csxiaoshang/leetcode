package main.java.offer.perfectworld;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-14 下午7:26
 * <p>
 * 类说明：
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            System.out.println(0);
        }
        int[][] nums = new int[n][2];
        for (int i = 0; i < n; i++) {
            nums[i][0] = in.nextInt();
            nums[i][1] = in.nextInt();
        }
        Arrays.sort(nums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });
        int[] count = new int[n];
        count[0] =1;
        int res = 1;
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i-1; j>=0;j--){
                if (nums[i][0] > nums[j][0] && nums[i][1] > nums[j][1]) {
                    max = Math.max(max, count[j]);
                }
            }
            count[i] = max+1;
            res = Math.max(res, count[i]);
        }
        System.out.println(res);
    }
}
