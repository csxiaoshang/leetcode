package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-12-21 上午10:25
 * <p>
 * 类说明：
 */
public class DivideStr {
    public boolean check(String words,String str){
        String[] word = words.split(" ");
        StringBuilder sb = new StringBuilder(str);
        for (String s : word) {
            int index = sb.indexOf(s);
            while (index != -1) {
                sb.delete(index, s.length());
            }
        }
        return sb.length() == 0;
    }
}
