package main.java;

import java.util.HashMap;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-12-12 下午3:48
 * <p>
 * 类说明：
 */
public class RomantoInteger13 {
    class Solution {
        public int romanToInt(String s) {
            if(s==null||s.length()==0)
                return 0;
            char[] str = s.toCharArray();
            int length = str.length;
            HashMap<Character,Integer> hashmap = new HashMap<>();
            hashmap.put('I',1);
            hashmap.put('V',5);
            hashmap.put('X',10);
            hashmap.put('L',50);
            hashmap.put('C',100);
            hashmap.put('D',500);
            hashmap.put('M',1000);
            int res =0;
            char tem = str[0];
            for(int i=0;i<length;i++){
                int index = hashmap.get(str[i]);
                int pre = hashmap.get(tem);
                tem = str[i];
                if(index>pre){
                    res+=index-2*pre;
                    continue;
                }
                res+=index;
            }
            return res;
        }
    }
}
