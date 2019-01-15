package main.java;

public class FlippingAnImage {
    public int[][] flippingAndInvertImage(int[][] A){
        int len = A.length;
        int[][] temp = new int[len][];
        for(int i=0;i<len;i++)
        {
            int lenb = A[i].length;
            temp[i] = new int[lenb];
            for(int j = 0;j<lenb;j++)
            {
                temp[i][lenb-j-1] = A[i][j]==0?1:0;
            }
        }
        return temp;

    }
}
