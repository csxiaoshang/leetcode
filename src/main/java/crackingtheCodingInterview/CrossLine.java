package main.java.crackingtheCodingInterview;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-9-25 下午8:52
 * <p>
 * 类说明：
 */
public class CrossLine {
    public boolean checkCrossLine(double s1, double s2, double y1, double y2) {
        // write code here
        if (s1 != s2) {
            return true;
        } else if (y1 == y2) {
            return true;
        } else {
            return false;
        }
    }
}
