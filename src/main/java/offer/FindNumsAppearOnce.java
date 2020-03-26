package main.java.offer;

import java.util.HashMap;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-22 下午7:34
 * <p>
 * 类说明：
 */
public class FindNumsAppearOnce {
    /**
     *@Description:  一个数组除了两个数组外，其他的数组都出现了两次
     *@param: array
    *@param: num1
    *@param: num2
     *@return: void
     *@Author: ashang
     *@date: 19-4-23下午7:30
    */
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int lenth=array.length;
        if (lenth==2){
            num1[0]=array[0];
            num2[0]=array[1];
        }
        int tem=0;
        for (int i=0;i<lenth;i++)
            tem^=array[i];
        int index=First1(tem);
        for (int i=0;i<lenth;i++){
            if (group(array[i],index)==true)
                num1[0]^=array[i];
            else
                num2[0]^=array[i];
        }
    }
    public int First1(int num){
        int index=0;
        while((num&1)==0){
            num>>=1;
            index++;
        }
        return index;
    }
    public boolean group(int num,int index){
        return ((num>>index)&1)==1?true:false;
    }
}
