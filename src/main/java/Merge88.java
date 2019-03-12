package main.java;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-12 下午9:10
 * <p>
 * 类说明：
 */
public class Merge88 {
    public void merge(int[] nums1,int m,int[] nums2,int n){
        int size=nums1.length;
        int[] result=new int[size];
        int i=0,j=0;
        int count=0;
        while (i<m||j<n){
            if (j>=n) {
                result[count++] = nums1[i++];
                continue;
            }
            if(i>=m){
                result[count++]=nums2[j++];
                continue;
            }
            if (nums1[i]<nums2[j]){
                result[count++]=nums1[i++];
            }else{
                result[count++]=nums2[j++];
            }
        }
        for (int num=0;num<result.length;num++){
            nums1[num]=result[num];
        }
    }
}

