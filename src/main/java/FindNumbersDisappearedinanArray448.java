package main.java;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-12-24 上午9:40
 * <p>
 * 类说明：
 */
public class FindNumbersDisappearedinanArray448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {


        LinkedList<Integer> list = new LinkedList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                int tem = nums[i];
                set(tem, nums);
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                list.add(i + 1);
            }
        }
        return list;
    }

    void set(int tem, int[] nums) {
        if (nums[tem - 1] == 0)
            return;
        int swap = nums[tem - 1];
        nums[tem - 1] = 0;
        set(swap, nums);
    }
}
