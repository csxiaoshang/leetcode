package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-27 下午5:27
 * <p>
 * 类说明：
 */
public class MinNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        if (array.length==0)
            return 0;
        for (int i=array.length-1;i>0;i--){
            if (array[i]<array[i-1])
                return array[i];
        }
        return array[0];
    }
}
