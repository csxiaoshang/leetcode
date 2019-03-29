package main.java.offer;

import java.util.ArrayList;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-29 下午8:00
 * <p>
 * 类说明：
 */
public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result=new ArrayList<>();
        if (matrix.length==0)
            return result;
        int row=matrix.length;
        int column=matrix[0].length;
        if (column==0)
            return result;
        int layers=(Math.min(row,column)-1)/2+1;
        for (int i=0;i<layers;i++){

            for(int k = i;k<column-i;k++) result.add(matrix[i][k]);//左至右
            for(int j=i+1;j<row-i;j++) result.add(matrix[j][column-i-1]);//右上至右下
            for(int k=column-i-2;(k>=i)&&(row-i-1!=i);k--) result.add(matrix[row-i-1][k]);//右至左
            for(int j=row-i-2;(j>i)&&(column-i-1!=i);j--) result.add(matrix[j][i]);//左下至左上
        }
        return result;
    }
}
