package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-23 下午10:40
 * <p>
 * 类说明：
 */
public class LongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String pre = strs[0];
        int i = 1;
        while(i<strs.length){
            while(!strs[i].startsWith(pre)){
                pre = pre.substring(0,pre.length()-1);
            }
            i++;
        }
        return pre;
    }
}
