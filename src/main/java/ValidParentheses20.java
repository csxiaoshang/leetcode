package main.java;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-12-12 下午3:45
 * <p>
 * 类说明：
 */
public class ValidParentheses20 {
    class Solution {
        public boolean isValid(String s) {
            char[] str = s.toCharArray();
            int length = str.length;
            LinkedList<Character> list = new LinkedList<>();
            HashMap<Character,Character> hashMap = new HashMap<>();
            hashMap.put('(',')');
            hashMap.put('[',']');
            hashMap.put('{','}');
            for(int i=0;i<length;i++){
                if(str[i] == '('||str[i]=='[' || str[i] == '{'){
                    list.push(str[i]);
                }else{
                    if(list.isEmpty()){
                        return false;
                    }else{
                        char c = list.pop();
                        char cc = hashMap.get(c);
                        if(cc != str[i]){
                            return false;
                        }
                    }
                }
            }
            if(list.isEmpty())
                return true;
            else
                return false;
        }
    }
}
