package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-18 上午11:33
 * <p>
 * 类说明：
 */
public class RemoveDuplicatesfromSortedArray26 {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int tem = nums[0];
        int flag = tem - 1;
        for (int i = 1; i < nums.length; i++) {
            if (tem == nums[i]) {
                nums[i] = flag;

            } else {
                tem = nums[i];
                count++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == flag) {
                int k = i + 1;
                while (k < nums.length && nums[k] == flag) {
                    k++;
                }
                if (k < nums.length) {
                    nums[i] = nums[k];
                    nums[k] = flag;
                }
            }
        }
        return count;
    }
}
