package main.java.test.testInputOutput;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-20 下午4:43
 * <p>
 * 类说明：
 */
public class AB7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String[] str = in.nextLine().trim().split(" ");
            int sum =0;
            for (int i=0;i<str.length;i++){
                sum+=Integer.valueOf(str[i]);
            }
            System.out.println(sum);
        }
    }
}
