package main.java;

/**
 * @Author ashang
 * @Date 19-2-25 下午7:47
 * @Description TODO
 **/
public class Flower605 {
    public boolean canPlant(int[] flower,int n){
        int len=flower.length;
        int count=0;
        for (int i=0;i<len;i++){
            if (flower[i]==1) continue;
            int pre=i==0?0:flower[i-1];
            int next=i==len-1?0:flower[i+1];
            if (pre==0&&next==0){
                count++;
                flower[i]=1;
            }
        }
        return count>=n;
    }
}
