package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-25 下午7:32
 * <p>
 * 类说明：
 */
public class isContinuous {
    public boolean isContinuous(int [] numbers) {
        int[] num=new int[14];
        int min=-1,max=14;
        for (int i=0;i<numbers.length;i++){
            num[numbers[i]]++;
            if (numbers[i]==0)
                continue;;
            if (num[numbers[i]]>1)
                return false;
            max=numbers[i]>max?numbers[i]:max;
            min=numbers[i]<min?numbers[i]:min;
        }
        if (max-min<5&&max-min>=0)
            return true;
        else return false;
    }
}
