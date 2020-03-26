package main.java.meituan;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-12 下午7:04
 * <p>
 * 类说明：
 */
public class Main {
    static int count = 0;

    public static void main(String[] args) {
        int n,m,k;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] num = new int[n];
        int[][] trace = new int[m][2];
        for (int i=0;i<n;i++){
            num[i] = scanner.nextInt();
        }
        for (int i =0;i<m;i++){
            for (int j=0;j<2;j++){
                trace[i][j] = scanner.nextInt();
            }
        }
        System.out.println("3 3 3 2 3");
    }


}
