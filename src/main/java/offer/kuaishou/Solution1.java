package main.java.offer.kuaishou;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-22 下午6:33
 * <p>
 * 类说明：
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().trim().split(" ");
        int[] num = new int[str.length];
        int len = num.length;
        for(int i =0;i<len;i++){
            num[i] = Integer.valueOf(str[i]);
        }
        int[] res = new int[len];
        res[0] = -1;
        int count = 0;
        for(int i = len-1;i>0;i--){
            int tem =0;
            for(int j=i-1;j>=0;j--){
                if(num[j]>num[i]){
                    tem++;
                }
            }
            if(tem == 1){
                res[count] = i;
                count++;
            }
        }
        for(int i = count-1;i>0;i--){
            System.out.print(res[i]+" ");
        }
        System.out.println(res[0]);
    }
    public int[] DistanceToHigher (int[] height) {
        // write code here
        int len = height.length;
        int[] res = new int[len];
        for(int i = len-1;i>0;i--){
            int tem =1;
            for(int j=i-1;j>=0;j--){
                if(height[j]>height[i]){
                    res[i] = tem;
                    break;
                }
                tem++;
            }
        }
        res[0] = 0;
        return res;
    }
}
