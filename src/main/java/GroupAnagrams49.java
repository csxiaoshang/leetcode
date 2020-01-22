package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-1-22 下午3:31
 * <p>
 * 类说明：
 */
public class GroupAnagrams49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String tem = String.valueOf(ch);
            if(map.containsKey(tem)){
                List<String> temList = map.get(tem);
                temList.add(str);
                map.put(tem,temList);
            }else{
                List<String> newList = new ArrayList<>();
                newList.add(str);
                map.put(tem,newList);
            }
        }
        return  new ArrayList<List<String>>(map.values());
    }
}
