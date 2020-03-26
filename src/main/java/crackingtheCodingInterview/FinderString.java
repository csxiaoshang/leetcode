package main.java.crackingtheCodingInterview;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-11-15 下午4:50
 * <p>
 * 类说明：
 */
public class FinderString {
    public int findString(String[] str, int n, String x) {
        // write code here
        int l=0,r=n-1,mid;
        while (l <= r) {
            mid = (l + r)/2;
            if (str[mid].equals(x)) {
                return mid;
            }
            int tem =mid;
            while (str[mid].equals("")) {
                if (mid > l) {
                    mid--;
                }else {
                    l = tem +1;
                    break;
                }
            }
            int compare = str[mid].compareTo(x);
            if (compare < 0) {
                l = mid +1;
            }else {
                r = mid -1;
            }
        }
        return -1;
    }
}
