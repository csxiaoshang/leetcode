package main.java;

/**
 * @Author ashang
 * @Date 19-2-25 下午8:38
 * @Description TODO
 **/
public class Subsequence392 {
    public AssignCookies assignCookies;
    public Subsequence392(AssignCookies assignCookies){
        this.assignCookies=assignCookies;
    }
    public void play(){
        assignCookies.play();
    }
    public boolean isSubsequence(String s,String t){
        for (int i = 0, pos = 0; i < s.length(); i++, pos++) {
            pos = t.indexOf(s.charAt(i), pos);
            if(pos == -1) return false;
        }
        return true;
    }
}
