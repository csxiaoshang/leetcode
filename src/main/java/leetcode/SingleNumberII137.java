package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-26 上午10:31
 * <p>
 * 类说明：
 */
public class SingleNumberII137 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < Integer.SIZE; i++) {
            int count = 0;
            for (int cur : nums) {
                if ((cur >> i & 1) == 1) {
                    count++;
                }
            }
            if (count % 3 == 1) {
                res|=1<<i;
            }
        }
        return res;
    }
}
