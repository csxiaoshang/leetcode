package main.java;

import java.util.Arrays;

/**
 * @Author ashang
 * @Date 19-2-21 下午9:10
 * @Description TODO
 **/
public class Minimus452 {
    public int findMinArrowShots(int[][] points){
        if (points.length==0)
            return 0;
        Arrays.sort(points,(a, b)->(a[1]-b[1]));
        int count=1;
        int current=points[0][1];
        for (int i=0;i<points.length;i++){
            if(current>=points[i][0]){
                continue;
            }
            count++;
            current=points[i][1];
        }
        return count;
    }
}

