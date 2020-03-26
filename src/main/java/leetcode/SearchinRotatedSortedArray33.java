package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-1-10 上午9:20
 * <p>
 * 类说明：
 */
public class SearchinRotatedSortedArray33 {
    public int search(int[] nums, int target) {
        int res = -1;
        int l = 0,r = nums.length - 1;
        while(l<=r){
            int mid = (l+r) >> 1;
            if(nums[mid] == target)
                return mid;
            if(nums[mid]<nums[r]){
                if(target>nums[mid] && target <= nums[r]){
                    l = mid + 1;
                }else{
                    r = mid - 1;
                }
            }else{
                if(target<nums[mid] && target >= nums[l]){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }
            }
        }
        return res;
    }

}
