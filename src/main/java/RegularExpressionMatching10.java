package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-24 下午8:34
 * <p>
 * 类说明：
 */
public class RegularExpressionMatching10 {
    /**
     * recursion solution
     * @param s
     * @param p
     * @return
     */
    public boolean isMatch(String s, String p) {
        if(p.isEmpty()){
            return s.isEmpty();
        }
        boolean first = (!s.isEmpty()&&(p.charAt(0) == s.charAt(0)||p.charAt(0) == '.'));
        if(p.length()>=2&&p.charAt(1)=='*'){
            return (isMatch(s,p.substring(2))||(first&&isMatch(s.substring(1),p)));
        }else{
            return first&&isMatch(s.substring(1),p.substring(1));
        }
    }
}
