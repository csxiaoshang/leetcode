package main.java.offer;

import java.util.ArrayList;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-15 下午5:08
 * <p>
 * 类说明：
 */
public class GetUglyNumber_Solution {
    public int GetUglyNumber_Solution(int index) {
        int count=3;
        int res=0;
        while(index>2){
            int tem=judge(count);
            index-=tem;
            if (tem==1)
                res=count;
            count++;
        }
        return index==1?1:count;
    }
    public int judge(int num){
        int flag_1=0;
        int flag=0;
        if (num%2==0||num%3==0||num%5==0)
            flag_1=1;
        else
            return 0;
        for (int i=4;i<Math.sqrt(num)+1;i++){
            if (i!=5&&num%i==0){
                flag=1;
                break;
            }
        }
        return flag==0?1:0;
    }
}
