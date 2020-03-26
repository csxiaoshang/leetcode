package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-29 下午7:58
 * <p>
 * 类说明：
 */
public class StrToInt {
    public int StrToInt(String str) {
        if (str.equals(""))
            return 0;
        if (str.equals("0"))
            return 0;
        int lenth=str.length();
        int res=0;
        int tem=0;
        int count=0;
        while(count<lenth){
            if ((str.charAt(count)=='+'||str.charAt(count)=='-')&&count==0)
            {
                count++;
                continue;
            }

            if (match(str.charAt(count))==true){
                tem=str.charAt(count)-'0';
            }else
                return 0;
            res=res*10+tem;
            count++;
        }
        if (str.charAt(0)=='+')
            return res;
        else if(str.charAt(0)=='-')
            return -res;
        else
            return res;
    }
    public boolean match(char c){
        if (c>='0'&&c<='9')
            return true;
        return false;
    }
}
