package main.java;

public class LonggetCommonPrefix {
    public String longgestCommonPrefix(String[] strs){
        int len=strs.length;
        if(len==0)
            return "";
        int minlen=0x7fffffff;
        for(String str:strs){
            minlen=Math.min(minlen,str.length());
        }
        for(int j=0;j<minlen;j++){
            for(int i=1;i<len;i++){
                if(strs[0].charAt(j)!=strs[i].charAt(j))
                    return strs[0].substring(0,j);
            }
        }
        return strs[0].substring(0,minlen);
    }
}
