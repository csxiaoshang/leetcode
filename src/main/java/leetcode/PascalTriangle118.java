package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-24 下午6:02
 * <p>
 * 类说明：
 */
public class PascalTriangle118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) {
            return res;
        }
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i ) {
                    temp.add(1);
                }else {
                    List<Integer> pre = res.get(i - 1);
                    temp.add(pre.get(j - 1) + pre.get(j));
                }
            }
            res.add(temp);
        }
        return res;
    }
}
