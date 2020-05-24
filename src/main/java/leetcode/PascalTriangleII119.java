package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-24 下午6:12
 * <p>
 * 类说明：
 */
public class PascalTriangleII119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = null;
        for (int i = 0; i < rowIndex+1; i++) {
             temp = new ArrayList<>();
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
        return temp;
    }
}
