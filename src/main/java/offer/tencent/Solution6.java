package main.java.offer.tencent;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-9-6 下午7:54
 * <p>
 * 类说明：
 */
public class Solution6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num1 = new int[n];
        for (int i = 0; i < n; i++) {
            num1[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] num2 = new int[m];
        for (int i = 0; i < m; i++) {
            num2[i] = in.nextInt();
        }
        ArrayList<Integer> res = new ArrayList<>();
        int indexN = 0 ,indexM = 0;
        while (indexN < n && indexM < m) {
            if (num1[indexN] == num2[indexM]){
                res.add(num1[indexN]);
                indexM++;
                indexN++;
            }else if(num1[indexN] < num2[indexM]){
                indexM++;
            }else{
                indexN++;
            }
        }
        for (int i = 0; i < res.size(); i++) {
            if (i == 0) {
                System.out.print(res.get(i));
            }else{
                System.out.print(" "+res.get(i));
            }
        }
    }

}
