package main.java;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-10 下午8:31
 * <p>
 * 类说明：
 * leetcode 680
 */
public class Palindrome680 {
    public boolean validPalindrome(String s){
        char [] ch=s.toCharArray();
        int r=s.length()-1;
        int l=0;
        int flag=0;
        while(l<r){
            if (ch[l]!=ch[r])
            {
                flag++;
                if (ch[l]==ch[r-1])
                    r--;
                else l++;
                continue;
            }
            l++;
            r--;
        }
        if (flag>1)
            return false;
        else return true;
    }
}
