package main.java.crackingtheCodingInterview;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-9-11 下午8:05
 * <p>
 * 类说明：
 */
public class LCA {
    public int getLCA(int a, int b) {
        // write code here
        while (a != b) {
            if (a > b) {
                a /= 2;
            } else {
                b /= 2;
            }
        }
        return a;
    }
}
