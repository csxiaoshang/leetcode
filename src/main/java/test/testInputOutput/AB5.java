package main.java.test.testInputOutput;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-20 下午4:43
 * <p>
 * 类说明：
 */
public class AB5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i=0;i<t;i++){
            int n = in.nextInt();
            int sum =0;
            for (int j=0;j<n;j++){
                sum += in.nextInt();
            }
            System.out.println(sum);
        }
    }
}
