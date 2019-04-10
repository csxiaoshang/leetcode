package main.java.offer;

import java.util.HashMap;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-10 上午9:23
 * <p>
 * 类说明：
 */
public class MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i<array.length;i++){
            if (hashMap.containsKey(array[i]))
                hashMap.put(array[i],hashMap.get(array[i])+1);
            else hashMap.put(array[i],1);
        }
        int num=array.length/2;
        for (int key:hashMap.keySet()
             ) {
            if (hashMap.get(key)>num)
                return key;
        }
        return 0;
    }
}
