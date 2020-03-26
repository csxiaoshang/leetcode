package main.java;

/**
 * @Author ashang
 * @Date 19-2-25 下午8:06
 * @Description TODO
 **/
public class Possibility665 {
    public boolean checkPossibility(int[] nums){
        int count=0;
        int min=nums[0];
        for (int i=0;i<nums.length;i++){
            if (i==nums.length-1||i==0) continue;
            if (nums[i-1]>nums[i+1]){
                count++;
            }
        }
        return count<=1;
    }
}
