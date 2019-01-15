package main.java;

public class SingElementinasortedarray {
    public int singleNonDuplicate(int[] nums){
        int l=0,h=nums.length-1;
        while(l<h){
            int mid=l+(h-l)/2;
            if(mid%2==1)
                mid--;
             if (nums[mid]==nums[mid+1])
                l=mid+2;
            else h=mid;
        }
        return nums[l];
    }
}
