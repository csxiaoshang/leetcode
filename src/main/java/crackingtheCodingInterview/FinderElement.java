package main.java.crackingtheCodingInterview;

import java.util.Stack;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-11-17 下午9:24
 * <p>
 * 类说明：
 */
public class FinderElement {
    public int[] findElement(int[][] mat, int n, int m, int x) {
        // write code here
/*        int[] res = new int[2];
        int column = column(mat, n, m, x);
        System.out.println("column "+column);
        if (mat[column][m - 1] == x) {
            res[0] = column;
            res[1] = m -1;
            return res;
        }
        int raw = raw(mat, n, m, x, column);
        res[0] = column;
        res[1] = raw;
        return res;*/
/*        int raw =0 ,colum = 0;
        for(int i=0;i<n;i++){
            if(mat[i][m-1]>=x){
                raw = i;
                break;
            }
        }
        for(int i=0;i<m;i++){
            if(mat[raw][i] == x){
                colum = i;
                break;
            }
        }
        int[] res = new int[2];
        res[0] =raw;
        res[1] = colum;
        return res;*/
        int i=0;
        int j=m-1;
        int[] goal=new int[2];
        while(i<n&&j>=0){
            if(mat[i][j]==x){
                goal[0]=i;
                goal[1]=j;
                break;
            }
            else if(mat[i][j]>x) j--;
            else i++;
        }
        return goal;
    }

/*    int raw(int[][] mat, int n, int m, int x,int column) {
        int l = 0,r = m-1;
        int mid = 0;
        while (l <= r) {
             mid = (r+l)/2;
            if (mat[column][mid] == x) {
                return mid;
            } else if (mat[column][mid] < x){
                l = mid+1;
            }else {
                r = mid -1;
            }
        }
        return r==m-1?r:l;
    }

    int column(int[][] mat, int n, int m, int x) {
        int l=0,r=n-1;
        int mid = 0;
        while (l <= r) {
            mid = (r+l)/2;
            if (mid ==0 ||(mat[mid][m-1] >x&& mat[mid-1][m-1]<x)) {
                return mid;
            } else if (mat[mid][m-1] < x){
                l = mid+1;
            }else {
                r = mid -1;
            }
        }
        return r==n-1?r:l;
    }*/
}
