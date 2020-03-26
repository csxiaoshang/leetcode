package main.java.offer.kuaishou;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-22 下午7:29
 * <p>
 * 类说明：
 */
public class Solution3 {
    static HashMap<String, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().trim().split(",");
        String[] tem = new String[str.length];
        int count = 0;
        for(int i=0;i<str.length;i++){
            if(check(str[i],3)){
                tem[count++] = str[i];
            }
        }
        for(int i=count-1;i>0;i--){
            for(int j = i-1;j>=0;j--){
                if(map.get(tem[i])>map.get(tem[j])){
                    String s = tem[i];
                    tem[i] = tem[j];
                    tem[j] = s;
                }
            }
        }
        if(count == 0){
            System.out.println("null");
            return;
        }
        for(int i = 0;i<count-1;i++){
            System.out.print(tem[i]+",");
        }
            System.out.println(tem[count-1]);
    }
    private  static boolean check(String str, int start){
        char[] ch = str.toCharArray();
        int t = 3;
        int k = 1;
        int l = 2;
        for (int i = start+1;i<str.length();i++){
            if(ch[i] == ch[i-1]){
                t = t*10+3;
            }
            else if(ch[i] == ch[i-1]+1){
                k = k*10+1;
            }else if(ch[i] == ch[i-1]-1){
                l = l*10+2;
            }
            else {
                if (t >= 100 || k >= 100||l>=l) {
                    break;
                } else {
                    t = 0;
                    k = 0;
                    l= 0;
                }
            }
        }
        if(t >=100 || k>=100){
            l = l>k?l:k*2;
            t = t>l?t:l;
            map.put(str, t);
            return true;
        }else{
            return false;
        }
    }
}
