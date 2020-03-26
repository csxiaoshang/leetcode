package main.java.test.testInputOutput;

import java.util.Scanner;
import java.util.Arrays;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-20 下午5:21
 * <p>
 * 类说明：
 */
public class StringSort2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String[] str = in.nextLine().trim().split(" ");
            Arrays.sort(str);
            for (int i=0;i<str.length-1;i++){
                    System.out.print(str[i]+" ");
            }
            System.out.println(str[str.length-1]);
        }
    }
}
