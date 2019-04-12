package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-12 下午9:37
 * <p>
 * 类说明：
 */
public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }
        int res=0;
        int tem=0;
        for (int i=0;i<array.length;i++){
            tem+=array[i];
        }
    }
}
