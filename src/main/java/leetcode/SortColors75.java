package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-1-26 下午12:26
 * <p>
 * 类说明：
 */
public class SortColors75 {
    public void sortColors(int[] nums) {
        int length = nums.length;
        if(length < 2){
            return;
        }
        int current= 0;
        for(int i = 0;i<length;i++){
            if(nums[i] == 0){
                swap(nums,current++,i);
            }
            if(nums[i] == 2){
                swap(nums,i--,--length);
            }
        }
    }
    private void swap (int[] nums,int i,int j){
        int tem = nums[i];
        nums[i] = nums[j];
        nums[j] = tem;
    }
}
