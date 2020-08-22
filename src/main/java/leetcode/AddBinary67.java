package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-17 下午6:50
 * <p>
 * 类说明：
 */
public class AddBinary67 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("asdf");
        System.out.println(list.toString());
        int num = 6;
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
            System.out.println(num);
        }
        System.out.println(count);
    }
    public String addBinary(String a, String b) {
        String res = "";
        int alen = a.length();
        int blen = b.length();
        int l = alen-1;
        int r = blen-1;
        int carry = 0;
        while (l >= 0 || r >= 0) {
            int x = l >= 0 ? a.charAt(l--) - 48 : 0;
            int y = r >= 0 ? b.charAt(r--) - 48 : 0;
            int sum = x+y+carry;
            carry = 0;
            if (sum >= 2) {
                sum = sum %2;
                carry = 1;
            }
            res=sum+res;
        }
        if (carry == 1) {
            res = "1"+res;
        }
        return res;
    }
}
