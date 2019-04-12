package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-12 下午9:37
 * <p>
 * 类说明：
 */
public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length==0||array==null)
            return 0;
        int tem=0;
        int res=array[0];
        for (int i=0;i<array.length;i++){
            if (tem<=0)
                tem=array[i];
            else {
                tem+=array[i];
            }
            if (tem>res)
                res=tem;
        }
        return res;
    }

}
