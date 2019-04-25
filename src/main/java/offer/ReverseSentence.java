package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-25 下午7:15
 * <p>
 * 类说明：
 */
public class ReverseSentence {
    public String ReverseSentence(String str) {
        String res="",tem="";
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==' '){
                res=" "+tem+res;
                tem="";
            }else
                tem+=str.charAt(i);
        }
        return tem+res;
    }
}
