package main.java;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-10 上午10:00
 * <p>
 * 类说明：
 */
public class KthLargestElementinanArray215 {
    public static int findKthLargest(int[] nums, int k) {
        int index = 0;
        int min = Integer.MIN_VALUE;
        int max = 0;
        for(int i=0 ;i<k;i++){
            for(int j =0;j<nums.length;j++){
                if(nums[index] < nums[j]){
                    index = j;
                }
            }
            max = nums[index];
            nums[index] = min;
        }
        return max;
    }
    public int findKthLargestsort(int[] nums, int k) {
        final int N = nums.length;
        Arrays.sort(nums);
        return nums[N - k];
    }

    /**
     * 堆排序
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargestPriority(int[] nums, int k) {

        final PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int val : nums) {
            pq.offer(val);

            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }


    /**
     * The smart approach for this problem is to use the selection algorithm (based on the partion method - the same one as used in quicksort).
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargestQuickSelect(int[] nums, int k) {

        k = nums.length - k;
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            final int j = partition(nums, lo, hi);
            if(j < k) {
                lo = j + 1;
            } else if (j > k) {
                hi = j - 1;
            } else {
                break;
            }
        }
        return nums[k];
    }

    private int partition(int[] a, int lo, int hi) {

        int i = lo;
        int j = hi + 1;
        while(true) {
            while(i < hi && less(a[++i], a[lo])) {
                ;
            }
            while(j > lo && less(a[lo], a[--j])) {
                ;
            }
            if(i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private void exch(int[] a, int i, int j) {
        final int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private boolean less(int v, int w) {
        return v < w;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int res = findKthLargest(nums, k);
        System.out.println(res);
    }
}
