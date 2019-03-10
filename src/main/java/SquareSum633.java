package main.java;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-10 下午8:18
 * <p>
 * 类说明：
 * leetcode 633
 */
public class SquareSum633 {
    public boolean judgeSquareSum(int c){
        int a=0,b= (int) Math.sqrt(c);
        while (a<=b){
         int sum=a*a+b*b;
         if (sum==c) return true;
         else if (sum>c) b--;
         else a++;
        }
        return false;
    }
}
