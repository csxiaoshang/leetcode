package main.java.crackingtheCodingInterview;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-6-10 下午7:00
 * <p>
 * 类说明：
 * 利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能。比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。若压缩后的字符串没有变短，则返回原先的字符串。
 */
public class Zipper {
    public String zipString(String iniString) {
        // write code here
        /**
         * 这个代码不对
         */
/*        int length = iniString.length();
        char[] s = new char[2 * length];
        char c = '\0';
        int count = 0, tem = 1;
        for (int i = 0; i < length; i++) {
            if (c != iniString.charAt(i)) {
                c = iniString.charAt(i);
                s[count++] = iniString.charAt(i);
                s[count++] = (char) tem;
                tem = 1;
            } else {
                tem++;
                s[count] = (char) tem;
            }
        }
        if (count > length) {
            return iniString;
        }
        return new String(s, 0, count);*/

/**
 * 直接用String拼接速度要慢一下 o(n+k^2)
 */
/*        char c=iniString.charAt(0);
        String s = "";
        int count=1;
        for (int i=1;i<iniString.length();i++){
            if (c==iniString.charAt(i)){
                count++;
            }else {
                s=s+c+count;
                c=iniString.charAt(i);
                count=1;
            }
        }
        if (s.length()>iniString.length()){
            return iniString;
        }
        return s;*/
/**
 * 使用StringBuilder速度要快一些  o(n)
 */
        if (compareSize(iniString)>=iniString.length()){
            return iniString;
        }
        int count=1;
        StringBuilder stringBuilder=new StringBuilder();
        char c=iniString.charAt(0);
        for (int i=1;i<iniString.length();i++){
            if (c==iniString.charAt(i)) {
                count++;
            }else{
                stringBuilder.append(c).append(count);
                c=iniString.charAt(i);
                count=1;
            }
        }
        stringBuilder.append(c).append(count);
        return stringBuilder.toString();

    }
    public int compareSize(String iniString){
        if (iniString.isEmpty())
            return 0;
        int size=0;
        char c=iniString.charAt(0);
        int count=1;
        for (int i=1;i<iniString.length();i++){
            if (c==iniString.charAt(i)){
                count++;
            }else {
                size=size+1+String.valueOf(count).length();
                c=iniString.charAt(i);
                count=1;
            }
        }
        return size+1+String.valueOf(count).length();
    }
}
