package main.java.test.testInputOutput;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-20 下午4:41
 * <p>
 * 类说明：
 */
public class AB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a+b);
        }
    }
}
