package main.java.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-15 上午8:47
 * <p>
 * 类说明：
 */
public class PermutationSequence60 {
    public static void main(String[] args) {
        PermutationSequence60 p = new PermutationSequence60();
        System.out.println(p.getPermutation(3,3));
    }
    boolean flag = false;
    String res = "";
    int count  =0 ;
    public String getPermutation(int n, int k) {
            return null;
    }

    /**
     * time limit
     * @param n
     * @param k
     * @return
     */
    private String solution1(int n, int k) {
        int[] nums = new int[n];
        for (int i = 1; i <= n; i++) {
            nums[i-1] = i;
        }
        permutation(nums,new ArrayList<Integer>(),k);
        return res;
    }
    public void permutation(int[] nums,  List<Integer> list,int k) {
        if (flag){
            return ;
        }
        if (list.size() == nums.length) {
            count++;
            if (count == k) {
                StringBuilder sb = new StringBuilder();
                for (Integer i : list) {
                    sb.append(i);
                }
                res = sb.toString();
                flag = true;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(list.contains(nums[i])){
                continue;
            }
                list.add(nums[i]);
                permutation(nums,new ArrayList<>(list),k);
                list.remove(list.size() - 1);
        }
    }

    private String solution2(int n, int k) {
        return null;
    }
}
