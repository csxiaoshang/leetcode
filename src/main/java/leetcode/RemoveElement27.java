package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-27 上午11:14
 * <p>
 * 类说明：
 */
public class RemoveElement27 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        RemoveElement27 re = new RemoveElement27();
        re.removeElement(nums,2);
    }
    public int removeElement(int[] nums, int val) {
        return solution1(nums, val);
    }

    /**
     * o(n^2)
     * @param nums
     * @param val
     * @return
     */
    private int solution1(int[] nums,int val){
        int res = 0;
        int count =0;
        int len = nums.length;
        for (int i=0;i<len-count;){
            if (nums[i]!=val){
                res++;
                i++;
                continue;
            }
            count++;
            for (int j= i+1;j<len;j++){
                nums[j - 1] = nums[j];
            }
        }
        return res;
    }

    /**
     * two pointer
     * @param nums
     * @param val
     * @return
     */
    private int solution2(int[] nums,int val){
        int i =0;
        int len = nums.length;
        for (int j=0;j<len;j++){
            if(nums[j]!=val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
