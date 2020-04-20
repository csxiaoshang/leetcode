package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-20 上午10:27
 * <p>
 * 类说明：
 */
public class RDuplicatesfromSortedArrayII80 {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 1;
        int max = 2;
        int count =1;
        for (; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast]) {
                nums[slow++] = nums[fast];
                count=1;
            }else {
                if (count < max) {
                    slow++;
                    nums[slow] = nums[fast];
                    count++;
                }
            }
        }
        return slow+1;
    }
}
