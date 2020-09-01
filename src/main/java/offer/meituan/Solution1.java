package main.java.offer.meituan;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-8-29 下午4:00
 * <p>
 * 类说明：
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        String headString = "";
        while (!headString.contains("M")){

            int headIndex = str.indexOf("T");
            headString = str.substring(0, headIndex);
            str = str.substring(headIndex+1);
        }
        int len = str.length();
        boolean isContainT = false;
        int end = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (str.charAt(i) == 'T'){
                isContainT = true;
            }
            if (isContainT && str.charAt(i) == 'M'){
                end = i;
                break;
            }
        }
        str = str.substring(0, end);
        System.out.println(str);
    }
}
