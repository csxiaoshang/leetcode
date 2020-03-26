package main.java.test.testInputOutput;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-20 下午4:43
 * <p>
 * 类说明：
 */
public class AB4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int t = in.nextInt();
            if (t == 0) {
                break;
            }
            int sum = 0;
            for (int i = 0; i < t; i++) {
                sum += in.nextInt();
            }
            System.out.println(sum);

        }
    }
}
