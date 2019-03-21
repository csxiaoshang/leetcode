package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-21 下午8:59
 * <p>
 * 类说明：
 */
public class ArraysFind {
    public boolean find(int target,int[][] array){
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                if (array[i][j]==target)
                    return true;
            }
        }
        return false;
    }

    /**
     * 第二种解法
     */
    public  boolean find2(int target,int[][] array){
        for (int i=0;i<array.length;i++){
            int l=0;
            int r=array[i].length-1;
            while (l<=r){
                int mid=(r+l)/2;
                if (array[i][mid]<target)
                    l=mid+1;
                else if (array[i][mid]>target)
                    r=mid-1;
                else
                    return true;
            }
        }
        return false;
    }
}
