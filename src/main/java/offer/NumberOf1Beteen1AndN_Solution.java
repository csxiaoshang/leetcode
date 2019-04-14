package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-14 下午8:07
 * <p>
 * 类说明：
 */
public class NumberOf1Beteen1AndN_Solution {
/*        int res=0;
        res+=n/10+(n%10!=0?1:0);
        int tem=n/100*10;
        if (n%100>=19)
            res=res+tem+10;
        else if (n%100<10)
            res=res+tem;
        else {
            res=res+tem+n%10+1;
        }
        res+=n/1000*100+(n/100>1?100:n%100);
        res+=n/1000==1?n%1000:0;
        return  res;*/


    public int NumberOf1Between1AndN_Solution(int n) {
        if(n <= 0)
            return 0;
        int count = 0;
        for(long i = 1; i <= n; i *= 10){
            long diviver = i * 10;
            count += (n / diviver) * i + Math.min(Math.max(n % diviver - i + 1, 0), i);
        }
        return count;
    }
}
