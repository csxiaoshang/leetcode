package main.java.offer.offer2;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-20 下午9:15
 * <p>
 * 类说明： 贪心算法
 */
public class CutRope2 {
    public int cutRope(int n) {
        if(n == 2){
            return 1;
        }
        if(n == 3){
            return 2;
        }
        int x = n%3;
        int y = n/3;
        int res = 0;
        if(x == 0){
            res = (int) Math.pow(3,y);
        }else if(x == 1){
            res = (int) Math.pow(3,y-1)*4;
        }else {
            res = (int) Math.pow(3,y)*2;
        }
        return res;
    }
}
