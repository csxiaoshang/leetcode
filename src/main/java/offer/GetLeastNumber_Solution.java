package main.java.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-10 下午9:22
 * <p>
 * 类说明：
 */
public class GetLeastNumber_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
/*        ArrayList<Integer> tmp= new ArrayList<>();
        if (k>input.length)
            return tmp;
        Arrays.sort(input);
        for (int i=0;i<k;i++)
            tmp.add(input[i]);
        return tmp;*/

        ArrayList<Integer> tmp=new ArrayList<>();
        if (k>input.length||k<=0)
            return tmp;
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i=0;i<input.length;i++){
            if (maxHeap.size()!=k){
                maxHeap.offer(input[i]);
            }else {
                if (maxHeap.peek()>input[i])
                {
                    Integer temp=maxHeap.poll();
                    temp=null;
                    maxHeap.offer(input[i]);
                }

            }
        }
        maxHeap.forEach(num->tmp.add(num));
        return tmp;
    }
}
