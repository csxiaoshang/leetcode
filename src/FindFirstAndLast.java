/**
 * @author ashang  970090853@qq.com
 * @Date 20-1-16 下午8:13
 * <p>
 * 类说明：
 */
public class FindFirstAndLast {

    /**
     * 这种方式不好 时间复杂度为 o(logn)+n
     */
/*    public int[] searchRange(int[] nums, int target) {
        int small =0,large =0;
        int left = 0;
        int right = nums.length -1;
        int tem = 0;
        while(left <= right){
            int mid = (left + right) >> 1;
            if(nums[mid] == target) {
                tem = mid;
                break;
            }
            if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid -1;
            }
        }
        small = tem;
        large = tem;
        while(nums[small]== target || nums[large] == target){
            if(nums[small] == target&& small != 0){
                small --;
            }
            if(nums[large] == target && large <nums.length -1){
                large++;
            }
        }
        int[] res = {small,large};
        return res;
    }*/

    // returns leftmost (or rightmost) index at which `target` should be
    // inserted in sorted array `nums` via binary search.
    private int extremeInsertionIndex(int[] nums, int target, boolean left) {
        int lo = 0;
        int hi = nums.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] > target || (left && target == nums[mid])) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] targetRange = {-1, -1};

        int leftIdx = extremeInsertionIndex(nums, target, true);

        // assert that `leftIdx` is within the array bounds and that `target`
        // is actually in `nums`.
        if (leftIdx == nums.length || nums[leftIdx] != target) {
            return targetRange;
        }

        targetRange[0] = leftIdx;
        targetRange[1] = extremeInsertionIndex(nums, target, false) - 1;

        return targetRange;
    }
}
