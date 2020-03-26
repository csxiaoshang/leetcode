package main.java.crackingtheCodingInterview;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-6-9 上午10:01
 * <p>
 * 类说明：
 * 请编写一个方法，将字符串中的空格全部替换为“%20”。假定该字符串有足够的空间存放新增的字符，并且知道字符串的真实长度(小于等于1000)，同时保证字符串由大小写的英文字母组成。
 */
public class Replacement {
    public String replaceSpace(String iniString, int length) {
        // write code here
        char[] s=new char[3*length];
        int count=0;
        for (int i=0;i<length;i++){
            if (iniString.charAt(i)!=' '){
                s[count++]=iniString.charAt(i);
            }else {
                s[count++]='%';
                s[count++]='2';
                s[count++]='0';
            }
        }
        return new String(s,0,count);

/*        int count=0;
        for(int i=0;i<length;i++){
            if(iniString[i]==' '){
                count++;
            }
        }
        int newLength=length+2*count;
        iniString[newLength]='\0';
        for(int i=length-1;i>=0;i--){
            if(iniString[i]!=' '){
                iniString[newLength-1]=iniString[i];
                newLength=newLength-1;
            }else{
                iniString[newLength-1]='0';
                iniString[newLength-2]='2';
                iniString[newLength-3]='%';
                newLength=newLength-3;
            }
        }
        return iniString;*/

    }
}
