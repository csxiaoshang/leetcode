package main.java;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-6 下午7:45
 * <p>
 * 类说明：
 */
public class LargestNumber179 {
    private class StringComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            String order1 = o1 + o2;
            String order2 = o2 + o1;
            return order2.compareTo(order1);
        }
    }

    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(str, new StringComparator());
        if(str[0].equals("0")){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s);
        }
        return sb.toString();
    }
}
