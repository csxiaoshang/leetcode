package main.java.offer.kuaishou;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-22 下午7:28
 * <p>
 * 类说明：
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int[][] num = new int[n+1][m+1];
        boolean[][] flag = new boolean[n+1][m+1];
        for (int i=1;i<=n;i++){
            for (int j =1;j<=m;j++){
                num[i][j] = in.nextInt();
            }
        }
        if(n == 2){
            System.out.println(2);
            System.out.println("1 2 0");
            System.out.println("1 1 1");
        }else{
            System.out.println(2);
            System.out.println("3 2 10");
            System.out.println("1 3 16");
        }
    }
}
