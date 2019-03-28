package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-27 下午7:48
 * <p>
 * 类说明：
 */
public class NumberOf1 {
    public int NumberOf1(int n) {
/*        int count=0;
        while (n>0){
            count = n%2==1?count+1:count;
            n=n/2;
        }
        return count;*/

        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }
}
