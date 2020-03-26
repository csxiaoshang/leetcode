package main.java;

import java.util.Arrays;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-12-21 上午11:30
 * <p>
 * 类说明：
 */
public class MinStack155 {

    int index;
    int[] value;


    /** initialize your data structure here. */
    public MinStack155() {
        this.value = new int[16];
    }

    public void push(int x) {
        if(index+1 > value.length){
            value = Arrays.copyOf(value,index+index);
        }
        value[index++] = x;
    }

    public void pop() {
        index--;
    }

    public int top() {
        int tem = index -1;
        return value[tem];
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i =0 ;i<index;i++){
            if(value[i] < min){
                min = value[i];
            }
        }
        return min;
    }

}
