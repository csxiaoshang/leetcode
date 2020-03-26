package main.java.crackingtheCodingInterview;

import java.util.*;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-11-25 下午8:21
 * <p>
 * 类说明：
 * 叠罗汉2
 */
public class Stack2 {
    public int getHeight(int[][] actors, int n) {
        // write code here
        int[] res = new int[n];
        int max = 0;
        Arrays.sort(actors,Comparator.comparingInt(o->o[0]));
        for(int i =0 ;i<n;i++){
            res[i] = 1;
            for(int j = 0;j<i;j++){
                if(actors[i][1]>actors[j][1]){
                    res[i] = Math.max(res[i],res[j]+1);
                }
            }
            max = Math.max(max,res[i]);
        }
        return max;
    }
}
