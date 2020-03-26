package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-24 下午7:51
 * <p>
 * 类说明：
 */
public class LeftRotateString {
    public String LeftRotateString(String str,int n) {

        String res;
        if (str==null||n<0||n>str.length())
            return "";
        return str.substring(n)+str.substring(0,n);
    }
}
