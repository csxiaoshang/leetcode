package main.java.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-5 下午11:26
 * <p>
 * 类说明：
 */
public class Permutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if(str!=null&&str.length()>0){
            permutation(str.toCharArray(),0,res);
            Collections.sort(res);
        }
        return res;
    }
    private void permutation(char[] chars,int i,ArrayList<String> res){
        if(i == chars.length-1){
            res.add(String.valueOf(chars));
            return;
        }else{
            HashSet<Character> set = new HashSet<>();
            for(int j =i;j<chars.length;j++){
                if(i==j || !set.contains(chars[j])){
                    set.add(chars[j]);
                    swap(chars,i,j);
                    permutation(chars,i+1,res);
                    swap(chars,j,i);
                }
            }
        }
    }
    private void swap(char[] chars,int i,int j){
        char tem = chars[i];
        chars[i] = chars[j];
        chars[j] = tem;
    }
}
