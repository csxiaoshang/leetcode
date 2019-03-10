package main.java;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author ashang
 * @Date 19-3-7 上午9:54
 * @Description TODO
 **/
public class ReverseVowels345 {
    public String reverseVowels(String s){
        HashSet<Character> hashSet=new HashSet<>(Arrays.asList('a','e','i',
                'o','u','A','E','I','O','U'));
        int l=0,r=s.length()-1;
        char[] chars=s.toCharArray();
        while(l<r){
            if (!hashSet.contains(chars[l])){
                l++;
                continue;
            }
            if (!hashSet.contains(chars[r])){
                r--;
                continue;
            }
            char c=s.charAt(l);
            chars[l]=s.charAt(r);
            chars[r]=c;
            l++;
            r--;
        }
        return new String(chars);
    }
}
