package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-12 下午5:10
 * <p>
 * 类说明：
 */
public class IsSubsequence392 {
    public static void main(String[] args) {
        IsSubsequence392 is = new IsSubsequence392();
        is.solution1("acb", "ahbgc");
    }
    public boolean isSubsequence(String s, String t) {
        return solution1(s, t);
    }

    /**
     * 回溯
     * @param s
     * @param t
     * @return
     */
    private boolean solution1(String s, String t) {
        if (t == null || t.length() == 0) {
            if (s == null || s.length() == 0) {
                return true;
            }else{
                return false;
            }
        }
        return dfs(s, 0, t, 0);
    }

    /**
     * greedy
     * @param s
     * @param t
     * @return
     */
    private boolean solution2(String s, String t) {
        if (t == null || t.length() == 0) {
            if (s == null || s.length() == 0) {
                return true;
            }else{
                return false;
            }
        }
        int index = -1;
        for (char c : s.toCharArray()) {
            index = t.indexOf(c, index + 1);
            if (index == -1) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(String s, int si, String t, int ti) {
        if (si == s.length()) {
            return true;
        }
        for (int i = ti; i < t.length(); i++) {
            if (s.charAt(si) == t.charAt(i)) {
                if (dfs(s, si + 1, t, i + 1)){
                    return true;
                }
            }
        }
        return false;
    }
}
