package main.java.offer.pinduoduo;

import java.util.Scanner;
import java.util.Arrays;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-10 下午6:56
 * <p>
 * 类说明：
 *  ac
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        long res = 0;
        Arrays.sort(nums);
        while (n- 3 >= 0) {
            res = res + nums[--n] + nums[--n];
            --n;
        }
        for (int i=0;i<n;i++){
            res +=nums[i];
        }
        System.out.println(res);
    }
}
