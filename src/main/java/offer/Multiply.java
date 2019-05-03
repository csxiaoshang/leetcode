package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-30 下午7:36
 * <p>
 * 类说明：
 */
public class Multiply {
    public int[] multiply(int[] A) {
        int length=A.length;
        int[] B=new int[length];
        if (length==0)
            return B;
         B[0]=1;
        for (int i=1;i<length;i++){
            B[i]=B[i-1]*A[i-1];
        }
        int tem=1;
        for (int i=length-1;i>=0;i--){
            B[i]=B[i]*tem;
            tem*=A[i];
        }
        return B;
    }
}
