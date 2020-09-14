package main.java.offer.tencent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-9-14 下午5:28
 * <p>
 * 类说明：统计abcd出现的次数接近于 2000:4000:6000:8000次
 *     c.进阶：是否存在通用解，n个广告，概率为p1:p2:...:pn
 *
 *     可以使用随机数生成函数
 */
public class Solution13 {

    List<Character> res = new ArrayList<>();


    public static void main(String[] args) {

        Solution13 solution = new Solution13();
        System.out.println(solution.solution());
    }

    public List<Character> solution(){
        int max = 10;
        char[] dir = new char[]{'a', 'b', 'c', 'd'};
        Random random = new Random();
        int temp = random.nextInt(max);
        if (temp == 0) {
            helper( dir[0]);
        } else if (temp >= 1 && temp <= 2) {
            helper( dir[1]);
        } else if (temp >= 3 && temp <= 5) {
            helper(dir[2]);
        }else {
            helper( dir[3]);
        }
        return res;
    }

    private void helper(char c) {
        if (res.size() == 2) {
            return;
        }
        if (!setChar(c) || res.size() == 1) {
            solution();
        }
    }

    private boolean setChar(char c) {
        if (res.size() >= 2) {
            return true;
        }
        if (res.isEmpty()) {
            res.add(c);
            return true;
        }else{
            if (res.get(0) == c) {
                return false;
            }
        }
        return true;
    }
}
