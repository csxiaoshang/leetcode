package main.java.offer.jd;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-18 下午7:01
 * <p>
 * 类说明：
 */
public class Solution1 {
    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static boolean check(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (nums[i][0] == nums[i][1]) {
                return false;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map.put(nums[i][j], map.getOrDefault(nums[i][j], 0) + 1);
            }
        }
        if (map.keySet().size()!=3){
            return false;
        }else {
            for (Integer i : map.values()) {
                if (i!=4){
                    return false;
                }
            }
        }
        return true;

    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean res;
        int t = in.nextInt();
        while (t-- > 0) {
            int[][] nums = new int[6][2];
            for (int i = 0; i < 6; i++) {
                nums[i][0] = in.nextInt();
                nums[i][1] = in.nextInt();
            }
            res = check(nums);
            System.out.println(res?"POSSIBLE":"IMPOSSIBLE");
        }

    }
}
