package main.java.offer.baidu;

import java.util.Scanner;
import java.util.Arrays;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-29 下午6:49
 * <p>
 * 类说明：
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int count = 0;
        for (; ; ) {
            int index =0;
            long max = Integer.MIN_VALUE;
            for (int i =0;i<n;i++){
                if (nums[i]>max){
                    max = nums[i];
                    index = i;
                }
            }
            if(nums[index]>=n){
                nums[index] = nums[index] - n;
                for (int i = 0;i<n;i++){
                    if (i == index){
                        continue;
                    }
                    nums[i]= nums[i]+1;
                }
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
