package main.java.offer.wangyi;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-7 下午7:25
 * <p>
 * 类说明：
 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] num = new int[n][m];
        int[][] res = new int[n][m];
        int[][] v = new int[n][m];
        for (int i = 0; i < n; i++) {
            int tem = in.nextInt();
            for (int j = m-1; j >=0; j--) {
                num[i][j] = tem%10;
                tem = tem /10;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = bfs(num,i,j,0,v);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == m-1){
                    System.out.println(res[i][j]);
                }else {
                    System.out.print(res[i][j]+" ");
                }
            }
        }
    }

    public static int bfs(int[][] num, int i, int j, int count,int[][] v) {
        int n = num.length;
        int m = num[0].length;
        if (i >= n || i < 0 || j >= m || j < 0) {
            return Integer.MAX_VALUE;
        }
        if (num[i][j] == 0){
            return count;
        }
        int res = 0;
        for (int k = i; k < n; k++) {
            for (int l = j;l<m;l++) {
                int a= Integer.MAX_VALUE;
                int b= Integer.MAX_VALUE;
                int c= Integer.MAX_VALUE;
                int d= Integer.MAX_VALUE;
                if (v[k][l - 1] == 0) {
                     a = bfs(num,k,l-1,count+1,v);
                    v[k][l - 1] = 1;
                }
                if (v[k][l + 1] == 0) {
                     b = bfs(num,k,l+1,count+1,v);
                    v[k][l +1] = 1;
                }
                if (v[k + 1][l] == 0) {
                     c = bfs(num,k+1,l,count+1,v);
                    v[k + 1][l] = 1;
                }
                if (v[k-1][l] == 0){
                    d = bfs(num,k-1,l,count+1,v);
                    v[k - 1][l] = 1;
                }
                 res = Math.min(a,b);
                res = Math.min(res, c);
                res = Math.min(res, d);
            }
        }
        return res;
    }
}
