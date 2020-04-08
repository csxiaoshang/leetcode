package main.java.algorithm.sort;

import sun.net.www.HeaderParser;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-8 上午11:53
 * <p>
 * 类说明： 手写堆排序
 */
public class HeapSort<T extends Comparable<T>> {
    public static void main(String[] args) {
        Integer[] test = {0,3,2,5,3,7,4,9};
        HeapSort<Integer> sort = new HeapSort<>();
        sort.sort(test);
        for (int i : test) {
            System.out.print(i);
        }
    }
    /**
     * 数组第 0 个位置不能有元素
     */
    public  void sort(T[] nums) {
        int n = nums.length-1;
        for (int k = n / 2; k >= 1; k--) {
            sink(nums, k, n);
        }
        while (n > 1) {
            swap(nums, 1, n--);
            sink(nums,1,n);
        }
    }

    private void sink(T[] nums, int l, int r) {
        while (2*l <= r) {
            int i = l*2;
            if (i < r && less(nums, i, i + 1)) {
                i++;
            }
            if (!less(nums,l,i)){
                break;
            }
            swap(nums,l,i);
            l = i;
        }
    }

    private boolean less(T[] nums, int i, int j) {
        return nums[i].compareTo(nums[j])<0;
    }
    private void swap (T[] nums,int i,int j) {
        T tem = nums[i];
        nums[i] = nums[j];
        nums[j] = tem;
    }
}
class Heap<T extends Comparable<T>>{
        private T[] heap;
        private int n;

    public Heap(int max) {
        this.heap = (T[]) new Comparable[max + 1];
    }
}

