package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author ashang
 * @Date 19-2-26 下午10:04
 * @Description TODO
 **/
public class Reconstruct406 {
    public int[][] reconstructQueue(int[][] people){
        if(people==null||people.length==0)
            return  new int[0][0];
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0]) return o1[1]-o2[1];
                return o1[0]-o2[0];
            }
        });
        int n=people.length;
        List<int[]> tmp=new ArrayList<>();
        for (int i=0;i<n;i++){
            tmp.add(people[i][1],new int[]{people[i][0],people[i][1]});
        }
        //不会
    }
}
