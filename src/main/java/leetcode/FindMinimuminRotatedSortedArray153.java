package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-27 上午9:59
 * <p>
 * 类说明：
 */
public class FindMinimuminRotatedSortedArray153 {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int l = 0,r = nums.length-1;
        while (l <= r) {
            int mid = l+(r-l)/2;
             if (nums[mid] > nums[r]) {
                l = mid+1;
            }else {
                r=mid-1;
            }
        }
        return nums[l];
    }
}
