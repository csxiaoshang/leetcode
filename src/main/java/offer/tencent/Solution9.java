package main.java.offer.tencent;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-9-6 下午8:58
 * <p>
 * 类说明：
 */
public class Solution9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int[] initNums = new int[n];
        for (int i = 0; i < n; i++) {
            initNums[i] = nums[i];
        }
        Arrays.sort(nums);
        Set<Integer> min = new HashSet<>();
        Set<Integer> max = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                min.add((int) nums[i]);
            }else{
                max.add((int) nums[i]);
            }
        }
        long midLeft = nums[n / 2 - 1];
        long midRight = nums[n / 2];
        for (int i = 0; i < n; i++) {
            if(min.contains(initNums[i])){
                System.out.println(midRight);
            }else {
                System.out.println(midLeft);
            }
        }
    }
}
