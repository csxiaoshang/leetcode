package main.java.offer.meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-8-29 下午4:28
 * <p>
 * 类说明：
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int res = 0;
        for (int l = 1; l <= m; l++) {
            for (int r = l; r <= m; r++) {
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    if ((nums[i] > 0 && nums[i] < l) ||
                            (nums[i] > r && nums[i] < m + 1)) {
                        list.add(nums[i]);
                    }
                }
                if (check(list)) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }

    public static boolean check(List<Integer> list) {
        if (list.size() <= 1) {
            return true;
        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) > list.get(i)) {
                return false;
            }
        }
        return true;
    }
}
