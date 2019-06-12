package main.java.crackingtheCodingInterview;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-6-12 下午10:06
 * <p>
 * 类说明：
 * 假定我们都知道非常高效的算法来检查一个单词是否为其他字符串的子串。请将这个算法编写成一个函数，给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成，要求只能调用一次检查子串的函数。
 */
public class ReverseEqual {
    public boolean checkReverseEqual(String s1, String s2) {
        // write code here
        int length=s1.length();
        if (s1.length()!=s2.length())
            return false;
        int index=0;
        char c=s1.charAt(0);
        for (int i=0;i<s1.length();i++){
            if (c==s2.charAt(i)){
                index=i;
                break;
            }
        }
        if (index==0)
            return false;
        for (int i=0;i<s1.length();i++){
            char c1=s1.charAt(i);
            int tem=index+i>=length?i-index:index+i;
            char c2=s2.charAt(tem);
            if (c1!=c2){
                return false;
            }
        }
        return true;
    }
}
