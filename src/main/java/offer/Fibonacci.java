package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-27 下午7:05
 * <p>
 * 类说明：
 */
public class Fibonacci {
    public int Fibonacci(int n) {
        if (n==0)
            return 0;
        if (n==1||n==2)
            return 1;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
