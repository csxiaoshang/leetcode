package main.java.offer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-1 下午8:04
 * <p>
 * 类说明： 滑动窗口的最大值
 */
public class SlideWindow {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res = new ArrayList<>();
        Deque<Integer> queue = new LinkedList<>();
        int length = num.length;
        if(num == null || num.length==0||size == 0){
            return res;
        }
        for(int i =0;i<length;i++){
            while(!queue.isEmpty()&&queue.peek()<i-size+1){
                queue.poll();
            }
            while(!queue.isEmpty()&&num[queue.getLast()]<=num[i]){
                queue.removeLast();
            }
            queue.add(i);
            if(i>=size-1){
                res.add(num[queue.peek()]);
            }
        }
        return res;
    }
}
