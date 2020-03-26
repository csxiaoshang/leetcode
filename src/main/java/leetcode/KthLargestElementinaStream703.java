package main.java;

import java.util.PriorityQueue;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-12-31 上午9:38
 * <p>
 * 类说明：
 */
public class KthLargestElementinaStream703 {
    PriorityQueue<Integer> q = null;
    int ksize = 0;

    public KthLargestElementinaStream703(int k, int[] nums) {

        ksize = k;
        q = new PriorityQueue<Integer>();
        for (int i = 0; i < nums.length; i++) {
            q.add(nums[i]);
        }
        while (q.size() > ksize) {
            q.poll();
        }
    }

    public int add(int val) {
        q.add(val);
        while (q.size() > ksize) {
            q.poll();
        }
        return q.peek();
    }
}
