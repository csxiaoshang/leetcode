package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-29 下午7:50
 * <p>
 * 类说明：
 */
public class Add {
    public int Add(int num1,int num2) {
        if (num1<0){
            while (num1<0){
                num2--;
                num1++;
            }
        }else {
            while(num1>0){
                num2++;
                num1--;
            }
        }
        return num2;
    }
}
