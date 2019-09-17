package main.java.crackingtheCodingInterview;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-9-17 下午9:26
 * <p>
 * 类说明：
 */
public class BinDecimal {
    public String printBin(double num) {
        // write code here

        int count = 0;
        StringBuilder res = new StringBuilder();
        res.append("0.");
        while(count > -32){
            if (num == 0.0){
                break;
            }
            int tem = num * 2 >= 1 ? 1:0;
            res.append(tem);
            num *= 2;
            System.out.println(" num :"+num);
            num = num >=1? num-1:num;
            System.out.println("count :"+count+" num :"+num);
            count--;
        }
        return num != 0 ? "Error" : res.toString();
    }
}
