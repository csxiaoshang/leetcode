package main.java;

/**
 * @Author ashang
 * @Date 19-2-27 下午8:13
 * @Description TODO
 **/
public class TwoSum167 {
    public int[] twoSum(int[] numbers,int target){
        int l=0;
        int r=numbers.length-1;
        while(l<r){
            int sum=numbers[l]+numbers[r];
            if (sum==target)
                return new int[]{l+1,r+1};
            if (sum<target)
                l++;
            else
                r--;
        }
        return null;
    }
}
