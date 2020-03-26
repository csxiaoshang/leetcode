package main.java.test.testInputOutput;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-20 下午5:32
 * <p>
 * 类说明：
 */
public class ZeroProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            long a = Long.parseLong(in.next());
            long b = Long.parseLong(in.next());
            System.out.println(a+b);
        }
    }
}
