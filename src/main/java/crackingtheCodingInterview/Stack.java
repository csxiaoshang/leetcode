package main.java.crackingtheCodingInterview;

import java.util.*;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-11-22 下午3:55
 * <p>
 * 类说明：叠罗汉
 */
public class Stack {
    public int getHeight(int[] men, int n) {
        // write code here
        int[] res= new int[n];
        int max = 0;
        for(int i =0;i<n;i++){
            res[i]=1;
            for(int j =0;j<i;j++){
                if(men[i]>men[j]){
                    res[i] =Math.max(res[i], res[j]+1);
                }
            }
            max = Math.max(max,res[i]);
        }
        return max;
    }
}
