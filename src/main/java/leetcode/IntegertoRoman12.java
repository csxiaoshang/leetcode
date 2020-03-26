package main.java;

import java.nio.channels.SelectionKey;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-25 上午9:40
 * <p>
 * 类说明：
 */
public class IntegertoRoman12 {
    public static void main(String[] args) {
        System.out.println(1 << 0);
    }
    public String intToRoman(int num) {
        return solution1(num);
    }
    private String solution1(int num){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(0,"");
        map.put(1,"I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "VIII");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(20, "XX");
        map.put(30, "XXX");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(60, "LX");
        map.put(70, "LXX");
        map.put(80, "LXXX");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(200, "CC");
        map.put(300, "CCC");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(600, "DC");
        map.put(700, "DCC");
        map.put(800, "DCCC");
        map.put(900, "CM");
        map.put(1000, "M");
        map.put(2000, "MM");
        map.put(3000, "MMM");
        map.put(4000, "MMMM");
        map.put(5000, "MMMMM");
        map.put(6000, "MMMMMM");
        map.put(7000, "MMMMMMM");
        map.put(8000, "MMMMMMMM");
        map.put(9000, "MMMMMMMMM");
        int count = 1;
        StringBuilder sb = new StringBuilder();
        LinkedList<String> stack = new LinkedList<>();
        while (num != 0) {
            int a = num%10;
            a = a*count;
            count= count*10;
            stack.push(map.get(a));
            num = num /10;
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
