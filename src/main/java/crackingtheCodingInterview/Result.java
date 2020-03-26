package main.java.crackingtheCodingInterview;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-12-3 下午10:02
 * <p>
 * 类说明：
 * 珠玑妙算
 */
public class Result {
    public int[] calcResult(String A, String guess) {
        // write code here
        int right = 0,right2=0;
        char[] c = A.toCharArray();
        char[] g = guess.toCharArray();
        int size = A.length();
        for(int i =0;i<size;i++){
            if(c[i]==g[i]){
                right++;
                g[i] = '0';
                c[i] = '1';
            }
        }
        for(int i=0;i<size;i++){
            int tem = 0;
            for(int j =0;j<size;j++){
                if(c[i]==g[j]){
                    g[j]='0';
                    tem++;
                    break;
                }
            }
            right2+=tem;
        }
        int[] res ={right,right2};
        return  res;
    }
}
