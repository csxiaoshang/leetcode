package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-12 上午10:46
 * <p>
 * 类说明：
 */
public class CountingBits338 {
    public int[] countBits(int num) {
        int result[] = new int[num + 1];
        int offset = 1;
        for (int index = 1; index < num + 1; ++index){
            if (offset * 2 == index){
                offset *= 2;
            }
            result[index] = result[index - offset] + 1;
        }
        return result;
    }
}
