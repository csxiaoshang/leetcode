package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-25 下午11:04
 * <p>
 * 类说明：
 */
public class PalindromePartitioning131 {
    public static void main(String[] args) {
        String s = "asdf";
        System.out.println(s.substring(1,2));
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return res;
        }
        trace(s,0,1,new ArrayList<>(),res);
        return res;
    }

    private void trace(String s, int l, int r, List<String> list, List<List<String>> res) {
        String str = s.substring(l, r);
        if (!isPalindrom(str)){
            return;
        }
        list.add(str);
        if (str.length() == 0) {
            list.remove(list.size()-1);
        }
        if (r == s.length()) {
            res.add(new ArrayList<>(list));
        }else{
            for (int i = r+1; i <= s.length(); i++) {
                trace(s,r,i,list,res);
            }
        }
        if (list.size() > 0) {
            list.remove(list.size() - 1);
        }
    }

    private boolean isPalindrom(String s) {
        int l = 0, r = s.length()-1;
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            }else {
                return false;
            }
        }
        return true;
    }
}
