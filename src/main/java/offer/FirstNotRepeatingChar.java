package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-18 下午7:45
 * <p>
 * 类说明：hash table
 */
public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        int[] index=new int[60];
        char[] s=new char[60];
        int[] count=new int[60];
        for (int i=0;i<60;i++)
            s[i]=']';
        int num=0;
        for (int i=0;i<str.length();i++){
            int tem=str.charAt(i)-'A';
            if (index[tem]!=0){
                index[tem]++;
            }else {
                index[tem]++;
                s[num]=str.charAt(i);
                count[num]=i;
                num++;
            }
        }
        for (int i=0;i<num;i++){
            int tem=s[i]-'A';
            if (index[tem]==1&&(tem>31||tem<26))
                return count[i];
        }
        return -1;
    }
}
