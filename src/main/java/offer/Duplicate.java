package main.java.offer;

import java.util.HashMap;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-29 下午8:45
 * <p>
 * 类说明：
 */
public class Duplicate {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        duplication[0]=-1;
        if (length==0)
            return false;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i<length;i++){
            if (hashMap.get(numbers[i])==null)
            {
                hashMap.put(numbers[i],1);
                continue;
            }
            if (hashMap.get(numbers[i])==1)
            {
                duplication[0]=numbers[i];
                return true;
            }
        }
        return false;
    }
}
