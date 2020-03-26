package main.java.offer.alibaba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-23 下午5:29
 * <p>
 * 类说明：
 */
public class Solution1 {
    static int mod = 1000000000+7;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            solution2(n);
        }


    }

    /**
     * 未经处理优化的解决方案
     * o(n^2)
     * @param n
     */
    private static void solution1(int n){
        int res = 0;
        for(int k=1;k<=n;k++){
            int tem =1;
            for (int i=0;i<k;i++){
                tem = tem*(n-i);
            }
            res += tem/cal(k)*k;
        }
        System.out.println(res);
    }

    /**
     * 使用组合公式 2^n优化计算
     * @param n
     * @return n*2^(n-1)
     */
    public static void solution2(int n) {
        long  res = n * pow1(2, n - 1)%mod;
        System.out.println(res);
    }

    public static int pow(int x, int y) {
        if(y ==0){
            return 1;
        }
        int tem = x*x%mod;
        return y%2==0?pow(tem,y/2):x*pow(tem,y/2);
    }
    public static long pow1(int x,int y){
        long ans = 1,tem = x;
        while(y>0){
            if((y&1) == 1){
                ans = tem * ans%mod;
            }
            tem = tem*tem%mod;
            y = y>>1;
        }
        return ans%mod;
    }
    /**　
     * 回溯方式
     */
    public static void solution3() {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] nums = new int[n];
            for (int i=1;i<=n;i++){
                nums[i-1] = i;
            }
            System.out.println(cal(nums));
        }

    }
    private static int cal(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return 0;
        }
        int count = 0;
        helper(nums,res,new ArrayList<Integer>(),0);
        for(List<Integer> list:res){
            count+=list.size();
            count = count %mod;
        }
        return count%(1000000000+7);
    }
    private static void helper(int[] nums,List<List<Integer>> result,List<Integer> subset,int pos){
        result.add(new ArrayList<Integer>(subset));
        if(pos == nums.length){
            return;
        }
        for(int i=pos;i<nums.length;i++){
            subset.add(nums[i]);
            helper(nums,result,subset,i+1);
            subset.remove(subset.size()-1);
        }

    }
    private static int cal(int n){
        int res = 1;
        for(int i=1;i<=n;i++){
            res*=i;
        }
        return res;
    }
    private void ss(){

    }
}
