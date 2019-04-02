package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-31 下午9:55
 * <p>
 * 类说明：
 */
public class VerifySqueceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length==0) return false;
        return compare(sequence,0,sequence.length-1);
    }
    public boolean compare(int [] tem,int l,int r){
        if (l>=r) return true;
        int i=r;
        while (i>l&&tem[i-1]>tem[r]) --i;
        for (int j=i-1;j>=l;--j) if (tem[j]>tem[r]) return false;
        return compare(tem,l,i-1)&&(compare(tem,i,r-1));
    }
}
