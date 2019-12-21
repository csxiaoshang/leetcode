package main.java;

import java.util.Arrays;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-12-21 下午4:12
 * <p>
 * 类说明：
 */
public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0)
            return;

        int index = 0;
        for(int i =0 ;i< nums1.length;i++){
            if(nums1[i] == 0){
                nums1[i] = nums2[index];
                index++;
                if(index == n)
                    break;
            }
        }
        Arrays.sort(nums1);
    }

}
