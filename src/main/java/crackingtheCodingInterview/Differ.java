package main.java.crackingtheCodingInterview;

import java.util.HashMap;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-6-5 下午9:43
 * <p>
 * 类说明：
 * 请实现一个算法，确定一个字符串的所有字符是否全都不同。
 */
public class Differ {
    public boolean checkDifferent(String iniString) {
        // write code here

/*        HashMap<Character,Integer> str=new HashMap<>();
        for (int i=0;i<iniString.length();i++){
            System.out.println(str.get(iniString.charAt(i)));
            str.put(iniString.charAt(i),str.get(iniString.charAt(i))==null?1:str.get(iniString.charAt(i))+1);
        }
        for (Integer i:str.values()){
            if (i>1){
                return false;
            }
        }
        return true;*/

/*        for(int i=0;i<iniString.length();i++){
            for(int j=i+1;j<iniString.length();j++){
                if(iniString.charAt(i)==iniString.charAt(j)){
                    return false;
                }
            }
        }
        return true;*/

    if (iniString.length()>256){
        return false;
    }
    boolean[] char1=new boolean[256];
    for (int i=0;i<iniString.length();i++){
        int val= iniString.charAt(i);
        System.out.println(val);
        if (char1[val]){
            return false;
        }
        char1[val]=true;
    }
    return true;
    }
}
