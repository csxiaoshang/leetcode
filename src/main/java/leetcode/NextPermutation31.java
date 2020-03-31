package main.java.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-31 上午9:21
 * <p>
 * 类说明：
 */
public class NextPermutation31 {
    public static void main(String[] args) {
        NextPermutation31 np = new NextPermutation31();
        int[] nums = {1,5,1};
        np.nextPermutation(nums);
    }
    public void nextPermutation(int[] nums) {
        int start = indexAt(nums);
        if (start == -1){
            reverse(nums,0);
            return;
        }
        int min = indexAtMin(nums, start);
        swap(nums,start,min);
        reverse(nums,start+1);
    }
    private int indexAtMin(int[] nums,int start) {
        int min = nums[start];
        int ans = 0;
        for (int i = start+1;i<nums.length;i++){
            if (nums[i]<=min){
                return i-1;
            }
            ans = i;
        }
        return ans;
    }
    private void swap(int[] nums, int i, int j) {
        int tem = nums[i];
        nums[i] = nums[j];
        nums[j] = tem;
    }
    private int indexAt(int[] nums){
        if (nums.length<=1){
            return -1;
        }
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i]>nums[i-1]){
                return i-1;
            }
        }
        return -1;
    }

    private void reverse(int[] nums,int s) {
        int l = s,r = nums.length-1;
        while (l < r) {
            swap(nums,l,r);
            l++;
            r--;
        }
    }
}
