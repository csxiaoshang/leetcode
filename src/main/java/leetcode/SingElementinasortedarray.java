package main.java;

public class SingElementinasortedarray {
    public int singleNonDuplicate(int[] nums){
        int l=0,r=nums.length;
        while(r>l){
            int mid=(r-l)/2+l;
            if(nums[mid-1]!=nums[mid]&&nums[mid+1]!=nums[mid])
                return nums[mid];
            else if (nums[mid]==nums[mid+1]){
                l=mid+2;
            }
            else {
                r=mid;
            }
        }
        return nums[l];
    }
}
