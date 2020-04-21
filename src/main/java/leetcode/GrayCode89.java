package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-21 上午8:29
 * <p>
 * 类说明：
 */
public class GrayCode89 {
    public List<Integer> grayCode(int n) {
        List<Integer> gray = new ArrayList<Integer>();
        gray.add(0); //初始化 n = 0 的解
        for (int i = 0; i < n; i++) {
            int add = 1 << i; //要加的数
            //倒序遍历，并且加上一个值添加到结果中
            for (int j = gray.size() - 1; j >= 0; j--) {
                gray.add(gray.get(j) + add);
            }
        }
        return gray;
    }

}
