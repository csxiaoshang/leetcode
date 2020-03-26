package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-1-7 上午9:25
 * <p>
 * 类说明：
 */
public class LetterCombinationsofaPhoneNumber17 {
    char [][] letter = {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},
            {'t','u','v'},{'w','x','y','z'}};
    List<String> res = new ArrayList<String>();
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0){
            return new ArrayList<String>();
        }
        int length = digits.length();
        char[] str = digits.toCharArray();
        backTrack(0,str,"");
        return res;
    }

    void backTrack(int index,char[] str,String comb){
        if(index == str.length){
            res.add(comb);
        }else{
            char ch = str[index];
            int num = ch - '2';
            for(int i = 0;i<letter[num].length;i++){
                backTrack(index+1,str,comb + letter[num][i]);
            }
        }
    }
}
