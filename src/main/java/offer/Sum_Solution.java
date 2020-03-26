package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-28 下午8:16
 * <p>
 * 类说明：
 */
public class Sum_Solution {
    public int Sum_Solution(int n) {
        if (n==1)
            return 1;
        return Sum_Solution(n-1)+n;
    }
}
