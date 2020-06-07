package main.java.leetcode;

import java.util.LinkedList;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-6-6 下午8:56
 * <p>
 * 类说明：
 */
public class SlidingWindowMaximum239 {
    /**
     * brute ok
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int resLen = len - k + 1;
        int[] res = new int[resLen];
        LinkedList<Integer> queue = new LinkedList<>();
        int resIndex = 0;
        int index = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            queue.offer(nums[i]);
            if (nums[i] >= max) {
                max = nums[i];
                index = i;
            }
        }
        res[resIndex++] = max ;
        for (int i = k; i < len;i++) {
            int cur = nums[i];
            queue.offer(cur);
            queue.poll();
            if (cur >= max) {
                max = cur;
                index = i;
            }else{
                int step = i-k+1;
                if (step > index) {
                     max = Integer.MIN_VALUE;
                    for (int j = step; j <= i; j++) {
                        if (nums[j] >= max) {
                            max = nums[j];
                            index = j;
                        }
                    }
                }
            }
            res[resIndex++] = max;
        }
        return res;
    }

    /**
     * 单调队列
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow1(int[] nums, int k) {
        int len = nums.length;
        int resLen = len-k+1;
        int[] res = new int[resLen];
        int index = 0;
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            // 如果队列头部元素下标已经超过滑动窗口的范围，应移出
            if (i >= k) {
                if (queue.peekFirst() == nums[i - k]) {
                    queue.removeFirst();
                }
            }
            int cur = nums[i];
            while (!queue.isEmpty()&&queue.getLast()<cur) {
                    queue.removeLast();
            }
            queue.offer(cur);
            if (i >= k-1) {
                res[index++] = queue.getFirst();
            }
        }
        return res;
    }
}
