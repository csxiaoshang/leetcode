package main.java.crackingtheCodingInterview;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-6-7 上午9:52
 * <p>
 * 类说明：
 * 请实现一个算法，在不使用额外数据结构和储存空间的情况下，翻转一个给定的字符串(可以使用单个过程变量)。
 */
public class Reverse {
    public String reverseString(String iniString) {
        // write code here
        char[] c=iniString.toCharArray();
        int left=0,right=iniString.length()-1;
        while(left<right){
            char tem=c[left];
            c[left]=c[right];
            c[right]=tem;
            left++;
            right--;
        }
        return new String(c);
    }


    /**
     * c++
     */
/*    class Reverse {
        public:
        string reverseString(string iniString) {
            // write code here
            int left=0,right=iniString.length()-1;
            while(left<right){
                char tem=iniString[left];
                iniString[left]=iniString[right];
                iniString[right]=tem;
                left++;
                right--;
            }
            return iniString;
        }
    };*/
}
