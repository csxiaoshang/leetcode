package main.java.offer.baidu;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-29 下午8:18
 * <p>
 * 类说明：
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Solution2 s = new Solution2();
        int res = Integer.MIN_VALUE;
        int[][] g = new int[n+1][n+1];
        for (int i=0;i<n+1;i++){
            for (int j =0;j<n+1;j++){
                g[i][j] = -1;
                g[j][i] = -1;
            }
        }
        for (int i =1;i<=n;i++){
            for (int j=i+1;j<=n;j++){
                res =s.lcm(i,j,g)-s.gcd(i,j,g)>res?s.lcm(i,j,g)-s.gcd(i,j,g):res;

            }
        }
        System.out.println(res);
    }
    private int gcd(int a,int b,int[][] g){
        if (a>b){
            int tem = b;
            b = a;
            a = tem;
        }
        if(b%a != 0){
            if(g[a][b] == -1) {
                int res = gcd(a, b % a, g);
                g[a][b] = res;
                g[b][a] = res;
                return res;
            }else {
                return g[a][b];
            }
        }else {
            return a;
        }
    }

    private int lcm(int a, int b,int[][] g) {
        return a * b / gcd(a, b,g);
    }

}
