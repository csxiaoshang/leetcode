package main.java.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-2 下午5:03
 * <p>
 * 类说明：
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n!=1){
            set.add(n);
            int tem = n;
            int res = 0;
            while (tem != 0) {
                int a = tem %10;
                res += a*a;
                tem = tem/10;
            }
            n = res;
            if (set.contains(n)) {
                break;
            }
        }
        return n == 1;
    }
}
