package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-6-7 上午9:48
 * <p>
 * 类说明：
 * - 使用list加上排序
 * - 两个优先级队列
 */
public class FindMedianfromDataStream295 {
    class MedianFinder {
        List<Integer> list = new ArrayList<>();
        /** initialize your data structure here. */
        public MedianFinder() {

        }

        public void addNum(int num) {
            int index = list.size()-1;
            while (index >= 0 && list.get(index) > num) {
                index--;
            }
            list.add(index + 1, num);
        }

        public double findMedian() {
            int size = list.size();
            int l = (size -1) /2;
            int r = (size -1) /2 +1;
            if (size % 2 == 1) {
                return list.get(l);
            }else{
                double leftVal = list.get(l);
                double rightVal = list.get(r);
                return (leftVal+rightVal)/2;
            }
        }
    }
}
