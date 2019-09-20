package main.java.crackingtheCodingInterview;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-9-20 下午7:19
 * <p>
 * 类说明：
 */
public class Render {
    public int[] renderPixel(int[] screen, int x, int y) {
        // write code here
        /**
         * 这个方法因为整形表示大小的限制 不能用
         */
/*        int numLen = screen.length;
        long tem = 0;
        while (--numLen >= 0) {
            tem = (tem << 8) + screen[numLen];
        }
        tem = (((1<<y) -1)& (~((1<<x) -1))) | tem;
        System.out.println("tem "+(tem >>8));
        for (int i = 0; i < screen.length; i++) {
            int midRes = (int) (tem - (tem & (~((1<<8) -1))));
            System.out.println("midRes :"+midRes );
            screen[i] = midRes;
            tem = tem >> 8;
        }
        return screen;*/

        for(int i = x; i <= y; i++){
            int n = i / 8;
            int nBit = i % 8;
            screen[n] |= (1 << nBit);
        }
        return screen;
        }
}
