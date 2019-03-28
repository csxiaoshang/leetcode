package main.java.offer;

import java.util.ArrayList;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-27 下午8:22
 * <p>
 * 类说明：
 */
public class ReOrderArray {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> odd=new ArrayList<>();
        for (int i=0;i<array.length;i++){
            if (isOdd(array[i]))
                odd.add(array[i]);
        }
        for (int i=0;i<array.length;i++){
            if (!isOdd(array[i]))
                odd.add(array[i]);
        }
        for (int i=0;i<odd.size();i++){
            array[i]=odd.get(i);
        }
    }
    boolean isOdd(int n){
        return n%2==1?true:false;
    }
}
