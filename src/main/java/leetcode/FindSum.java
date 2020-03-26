package main.java;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-20 下午12:03
 * <p>
 * 类说明：
 */
public class FindSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        boolean flag = true;
        int x = 0;
        while(true){
            int num = l*(l-1)/2;
             x = (n-num)/l;
            if(x*l + num == n){
                break;
            }
            l++;
        }
        if(l > 100){
            System.out.print("No");
        }else {
            for(int i =0;i<l;i++){
                if(i == 0){
                    System.out.print(x++);
                }else{
                    System.out.print(" "+x++);
                }
            }
        }
    }
}
