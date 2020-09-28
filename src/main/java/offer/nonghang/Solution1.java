package main.java.offer.nonghang;

import java.util.*;
/**
 * @author ashang  970090853@qq.com
 * @Date 20-9-26 上午10:22
 * <p>
 * 类说明：
 */
public class Solution1 {
    public static void main(String[] args) {
        int[] weight = {1, 2, 3, 1, 2, 3};
        System.out.println(solve(weight));
    }

    public static int solve(int[] weight){

        Arrays.sort(weight);
        int sum = 0;
        for (int val : weight) {
            sum+=val;
        }
        int subSum = 0;
        if (sum % 2 == 1) {
            return 0;
        }else{
            subSum = sum / 2;
        }
        int n = weight.length;
        for (int k = 0; k < n-2; k++) {
            int l = k+1;
            int r = n-1;
            while (l < r) {
                if (weight[k] + weight[l] + weight[r] == subSum) {
                    return 1;
                }else if (weight[k] + weight[l] + weight[r] > subSum){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return 0;
    }
}
