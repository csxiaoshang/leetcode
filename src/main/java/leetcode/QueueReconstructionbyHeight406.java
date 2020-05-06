package main.java.leetcode;

import java.util.*;
/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-6 上午8:43
 * <p>
 * 类说明：
 */
public class QueueReconstructionbyHeight406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]){
                    return o1[1]-o2[1];
                }
                return o2[0]-o1[0];
            }
        });
        int n = people.length;
        for (int i = 0; i < n; i++) {
            int[] cur = people[i];
            int temp = people[i][1];
            if (i != people[i][1]) {
                for (int j = i; j > temp; j--) {
                    people[j] = people[j-1];
                }
                people[temp] = cur;
            }
        }
        return people;
    }
}
