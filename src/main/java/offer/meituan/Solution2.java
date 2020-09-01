package main.java.offer.meituan;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-8-29 下午4:22
 * <p>
 * 类说明：
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] nums = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = in.nextInt();
            }
        }
        int[] table = new int[n + 1];
        String res = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int index = nums[i][j];
                if (table[index] == 0) {
                    res = res + index + " ";
                    table[index] = 1;
                    break;
                }
            }
        }
        res = res.substring(0, res.length() - 1);
        System.out.println(res);
    }
}
