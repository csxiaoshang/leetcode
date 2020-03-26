package main.java.crackingtheCodingInterview;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-6-11 下午6:53
 * <p>
 * 类说明：
 * 有一副由NxN矩阵表示的图像，这里每个像素用一个int表示，请编写一个算法，在不占用额外内存空间的情况下(即不使用缓存矩阵)，将图像顺时针旋转90度。
 */
public class Transform {
    public int[][] transformImage(int[][] mat, int n) {
        // write code here
        for(int i=0;i<n/2;i++){
            for (int j=i;j<n-1-i;j++){
                int tem=mat[i][j];
                mat[i][j]=mat[n-1-j][i];
                mat[n-1-j][i]=mat[n-1-i][n-1-j];
                mat[n-1-i][n-1-j]=mat[j][n-1-i];
                mat[j][n-1-i]=tem;
            }
        }
        return mat;
    }
}
