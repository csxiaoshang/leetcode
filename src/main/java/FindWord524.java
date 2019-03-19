package main.java;

import java.util.List;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-19 下午9:59
 * <p>
 * 类说明：
 */
public class FindWord524 {
    public String findLongestWord(String s, List<String> d){
        String tem="";
        for (String str:d){
            for (int i=0,j=0;i<s.length()&&j<str.length();j++){
                if (s.charAt(i)==str.length()){
                    j++;
                }
                if(j==str.length()){
                    if (j>tem.length()||(j==tem.length()&&tem.compareTo(str)>0))
                        tem=str;
                }
            }
        }
        return tem;
    }
}
