package main.java.crackingtheCodingInterview;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-6-8 下午2:57
 * <p>
 * 类说明：
 * 给定两个字符串，请编写程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。这里规定大小写为不同字符，且考虑字符串中的空格。
 */
public class Same {
    public boolean checkSam(String stringA, String stringB) {
        // write code here
/*        if(stringA.length()!=stringB.length()){
            return false;
        }
        int lenth=stringA.length();
        int[] a=new int[256];
        int[] b=new int[256];
        for (int i=0;i<lenth;i++){
            int aInt=stringA.charAt(i);
            int bInt=stringB.charAt(i);
            a[aInt]=a[aInt]+1;
            b[bInt]=b[bInt]+1;
        }
        for(int i=0;i<256;i++){
            if (a[i]!=b[i]){
                return false;
            }
        }
        return true;*/
/**
 * 优化后的代码
 */
        if (stringA.length()!=stringB.length()){
            return false;
        }
        int[] cc=new int[256];
        char[] stringa=stringA.toCharArray();
        for (char c:stringa){
            cc[c]=cc[c]+1;
        }
        for (int i=0;i<stringB.length();i++){
            int c=stringB.charAt(i);
            if (--cc[c]<0){
                return false;
            }
        }
        return true;
    }
}
