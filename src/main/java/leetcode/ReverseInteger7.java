package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-20 下午11:50
 * <p>
 * 类说明：
 */
public class ReverseInteger7 {
    public int reverse(int x) {
        int max = (1<<31)-1;
        int min = 0 - (1<<31);
        max = max /10;
        min = min /10;
        int res = 0;
        int symbol= x>0?1:-1;
        x = Math.abs(x);
        while(x>0){
            int tem = x %10;
            if(res>max||res < min){
                return 0;
            }
            res= res*10 +tem;
            x = x/10;
        }
        return res*symbol;
    }
    public static void main(String[] args) {
        System.out.println((1<<31)-1);
    }
}
