package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-27 下午12:47
 * <p>
 * 类说明：
 */
public class ImplementstrStr28 {
    public static void main(String[] args) {
        ImplementstrStr28 im = new ImplementstrStr28();
        im.strStr("hello", "ll");
    }
    public int strStr(String haystack, String needle) {
        return solution1(haystack, needle);
    }

    private int solution1(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        if (len1 == 0 && len2 == 0) {
            return 0;
        }
        for (int i = 0;i<len1;i++){
            boolean flag = true;
            int index = i;
            if(len1-index<len2){
                continue;
            }
            for (int j = 0;j<len2;j++){
                if (haystack.charAt(index++) != needle.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag == true){
                return i;
            }
        }
        return -1;
    }
}
