package main.java.offer;

import java.util.ArrayList;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-24 下午7:24
 * <p>
 * 类说明：
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        if(array==null||array.length<2)
            return arrayList;
        int left=0,right=array.length-1;
        while(left<right){
            if (array[left]+array[right]==sum){
                arrayList.add(array[left]);
                arrayList.add(array[right]);
                return arrayList;
            }else if(array[left]+array[right]>sum)
                right--;
            else
                left++;
        }
        return arrayList;
    }
}
