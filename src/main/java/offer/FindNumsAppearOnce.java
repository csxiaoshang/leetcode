package main.java.offer;

import java.util.HashMap;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-22 下午7:34
 * <p>
 * 类说明：
 */
public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i<array.length;i++){
            if (hashMap.containsKey(array[i]))
                hashMap.put(array[i],1);
            hashMap.put(array[i],0);
        }

    }
}
