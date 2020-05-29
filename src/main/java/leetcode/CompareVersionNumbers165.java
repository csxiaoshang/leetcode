package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-27 上午11:16
 * <p>
 * 类说明：
 */
public class CompareVersionNumbers165 {
    public int compareVersion(String version1, String version2) {
        return solution2(version1, version2);
    }

    /**
     * error
     * @param version1
     * @param version2
     * @return
     */
    private int solution1(String version1, String version2) {
        int res = 0;
        if (version1 == null || version2 == null) {
            return -1;
        }
        String[] num1 = version1.split("\\.");
        String[] num2 = version2.split("\\.");
        int index = 0;
        int len = Math.min(num1.length, num2.length);
        while (index < len && (res = num1[index].length() - num2[index].length()) == 0 && (res = num1[index].compareTo(num2[index])) == 0) {
            index++;
        }
        res = res != 0 ? res : num1.length - num2.length;
        return res;
    }

    private int solution2(String version1, String version2) {
        int res = 0;
        if (version1 == null || version2 == null) {
            return -1;
        }
        String[] num1 = version1.split("\\.");
        String[] num2 = version2.split("\\.");
        int i=0,j = 0;
        while (i < num1.length || j < num2.length) {
            String cur1 = i < num1.length ? num1[i] : "0";
            String cur2 = j < num2.length ? num2[j] : "0";
             res = compareToInt(cur1, cur2);
            if (res == 0) {
                i++;
                j++;
            } else  {
                return res;
            }
        }
        return 0;
    }

    private int compareToInt(String cur1, String cur2) {
        int n1 = Integer.valueOf(cur1);
        int  n2 = Integer.valueOf(cur2);
        if (n1 > n2) {
            return 1;
        } else if (n1 < n2){
            return -1;
        }else {
            return 0;
        }
    }
}
