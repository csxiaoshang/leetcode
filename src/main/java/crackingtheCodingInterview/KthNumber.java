package main.java.crackingtheCodingInterview;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-10-8 下午8:34
 * <p>
 * 类说明：
 */
public class KthNumber {
    public int findKth(int k) {
        // write code here
        int [] array =new int[k];
        int num3=0;
        int num5=0;
        int num7=0;
        array[0]=3;
        array[1]=5;
        array[2]=7;
        for(int i=3;i<k;i++){
            array[i]=Math.min(Math.min(array[num3]*3,array[num5]*5),array[num7]*7);
            if(array[i]==array[num3]*3) num3++;
            if(array[i]==array[num5]*5) num5++;
            if(array[i]==array[num7]*7) num7++;
        }
        return array[k-1];
    }

}
