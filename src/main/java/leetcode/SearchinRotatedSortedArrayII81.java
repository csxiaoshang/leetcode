package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-20 上午11:04
 * <p>
 * 类说明：
 */
public class SearchinRotatedSortedArrayII81 {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                return true;
            }
            //左半段有序
            if (nums[start] < nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if(nums[start] == nums[mid]){
                start++;
                //右半段有序
            }else{
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }

}
