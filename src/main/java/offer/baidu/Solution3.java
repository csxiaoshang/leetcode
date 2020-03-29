package main.java.offer.baidu;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-29 下午7:58
 * <p>
 * 类说明：
 */
public class Solution3 {
    static int max = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n+1];
        int[][] p = new int[n + 1][n + 1];
        for (int i=1;i<n+1;i++){
            a[i] = in.nextInt();
        }
        for (int i=0;i<n-1;i++){
            int b = in.nextInt();
            int c = in.nextInt();
            p[b][c] = 1;
            p[c][b] = 1;
        }
        int count = 0;
        for (int i = 1;i<n+1;i++){
            for (int j = i+1;j<n+1;j++){
                Solution3.trace(p,a,count,i,j);
            }
        }
    }
   private static void trace (int[][] p,int[] a,int count,int s,int e){
        int n = a.length;
        if(s == e){
            if (count>max){
                max = count;
            }
            return;
        }
        if(s>0&&s<n&&e>0&&e<n&&p[s][e] == 1&&a[s]<a[e]){
            //trace(p,a,count+1,s);
        }
    }
}
