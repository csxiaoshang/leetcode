package main.java;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public  int romanToInt(String s){
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int len=s.length();
        int sum=0;
        for(int i=0;i<len;i++) {
            if (i == len - 1)
                sum += map.get(s.charAt(i));
            else {
                if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                    sum += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                    i++;
                } else {
                    sum += map.get(s.charAt(i));
                }
            }
        }
        return sum;
    }
}
