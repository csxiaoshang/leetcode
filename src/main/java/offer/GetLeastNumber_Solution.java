package main.java.offer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-10 下午9:22
 * <p>
 * 类说明：
 */
public class GetLeastNumber_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> tmp= new ArrayList<>();
        if (k>input.length)
            return tmp;
        Arrays.sort(input);
        for (int i=0;i<k;i++)
            tmp.add(input[i]);
        return tmp;
    }
}
