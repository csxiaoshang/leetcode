package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-20 下午10:20
 * <p>
 * 类说明：
 */
public class MedianofTwoSortedArrays4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res = 0;
        int m =  nums1.length;
        int n = nums2.length;
        int[] nums = new int[nums1.length+nums2.length];
        int index = 0;
        int i =0,j=0;
        for(;i<nums1.length&&j<nums2.length;){
            if(nums1[i]<=nums2[j]){
                nums[index++] = nums1[i];
                i++;
            }else{
                nums[index++] = nums2[j];
                j++;
            }
        }
        if(i<m){
            while(i<m){
                nums[index++] = nums1[i++];
            }
        }else{
            while(j<n){
                nums[index++] = nums2[j++];
            }
        }
        int sum = m+n;
        if(sum%2 == 1){
            res = nums[sum/2];
        }else{
            res = (nums[sum/2]+nums[sum/2-1])/2.0;
        }
        return res;
    }
}
