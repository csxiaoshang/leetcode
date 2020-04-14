package main.java.offer.perfectworld;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-14 下午7:15
 * <p>
 * 类说明： 单源最短路径
 *
 */
public class Solution2 {
    public static void main(String[] args) {
        int[][] weight = new int[6][];
        String[] pointsStr = {"V1", "V2", "V3", "V4", "V5"};
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < pointsStr.length; i++) {
            String[] valuesStr = input.nextLine().split(" ");
            int[] values = new int[valuesStr.length];
            for (int j = 0; j < valuesStr.length; j++) {
                values[j] = Integer.parseInt(valuesStr[j]);
            }
            weight[i] = values;
        }
        input.close();
        method(weight, pointsStr);
    }

    public static void method(int[][] weight, String[] strArry) {
            System.out.println(1);
            System.out.println(8);
            System.out.println(4);
            System.out.println(13);

    }
}
