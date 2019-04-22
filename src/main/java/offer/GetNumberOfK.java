package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-22 下午6:17
 * <p>
 * 类说明：
 */
public class GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        int count=0;
        int mid = 0;
        int left=0,right=array.length-1;
        while(left<=right){
             mid=(left+right)>>1;
            if (array[mid]<k){
                left=mid+1;
            }else if (array[mid]>k){
                right=mid-1;
            }else
                left=right+1;
        }
        int tem=mid-1;
        while(mid<array.length&&mid>=0&&array[mid]==k){
            count++;
            mid++;
        }
        while(tem<array.length&&tem>=0&&array[tem]==k){
            count++;
            tem--;
        }
        return count;
    }
}
