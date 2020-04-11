package main.java.offer.wangyihuyu;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-11 下午7:00
 * <p>
 * 类说明：
 * ac
 */
public class Solution1 {
    public static void main(String[] args) {

        String str1 = "25";
        String str2 = "15";
        Solution1 s = new Solution1();
        System.out.println(s.add(str1,str2));
    }
    public String add (String num1, String num2) {
        // write code here
        String[] str1 = num1.split("\\.");
        String[] str2 = num2.split("\\.");
        int carry = 0;
        String res = "";
        String tail = "";
        String head = "";
        if (str1.length == 2 && str2.length == 2) {
            int len1 = str1[1].length();
            int len2 = str2[1].length();
            if (len1 < len2) {
                for (int i = len1; i < len2; i++) {
                    str1[1] += "0";
                }
            }else{
                for (int i = len2; i < len1; i++) {
                    str2[1] +="0";
                }
            }
            int len = len1>len2?len1:len2;
            for (int i = len - 1; i >= 0; i--) {
                int a = str1[1].charAt(i) - '0';
                int b = str2[1].charAt(i) - '0';
                int sum = a+b+carry;
                carry = sum /9;
                int cur = sum %9;
                tail = cur+tail;
            }
        } else if (str1.length == 2) {
            tail = str1[1];
        }else if (str2.length == 2){
            tail = str2[1];
        }
        String s1 = str1[0];
        String s2 = str2[0];
        int len1 = s1.length();
        int len2 = s2.length();
        int i =1;
        for (; i <= len1 && i <= len2; i++) {
            int cur1 = len1-i;
            int cur2 = len2 - i;
            int a = s1.charAt(cur1) - '0';
            int b = s2.charAt(cur2) - '0';
            int sum = a+b+carry;
            carry = sum/9;
            int cur = sum %9;
            head = cur+head;
        }
        if (i <= len1) {
            for (; i <= len1; i++) {
                int cur1 = len1 - i;
                int a = s1.charAt(cur1) - '0';
                int sum = a+carry;
                carry = sum /9;
                int cur = sum %9;
                head = cur + head;
            }
        }
        if (i <= len2) {
            for (; i <= len2; i++) {
                int cur2 = len2 - i;
                int a = s2.charAt(cur2) - '0';
                int sum = a+carry;
                carry = sum /9;
                int cur = sum %9;
                head = cur + head;
            }
        }
        if (carry != 0) {
            head = carry + head;
        }
        res = head;
        if (tail.length() != 0){
            res = res + "."+tail;
        }
        return res;
    }
}
