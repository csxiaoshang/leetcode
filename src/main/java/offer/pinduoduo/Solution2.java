package main.java.offer.pinduoduo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-10 下午7:03
 * <p>
 * 类说明：
 * 50%
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        List<List<Integer>> res = new ArrayList<>();
        // trace(nums,res,new ArrayList<>(),0);
        int count = 0;
/*        for (List<Integer> list : res) {
            System.out.println(list);
            int sum = 0;
            for (int i : list) {
                sum+=i;
            }
            if (sum%m == 0){
                count++;
            }
        }*/
        int len = nums.length;
        for (int k=1;k<=len;k++){
            for (int i =0;i< len;i++){
                int sum = 0;
                for (int j = i; i + k <= len && j < i + k; j++) {
                    sum+=nums[j];
                }
                if (sum != 0) {
                    if (sum % m == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    private static void trace(int[] nums,List<List<Integer>> res,List<Integer> list,int s){
        res.add(list);
        for (int i = s; i < nums.length; i++) {
            list.add(nums[i]);
            trace(nums, res, new ArrayList<>(list),i+1);
            list.remove(list.size() - 1);
        }
    }
}
