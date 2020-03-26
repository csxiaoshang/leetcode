package main.java.crackingtheCodingInterview;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-11-14 下午8:57
 * <p>
 * 类说明：
 */
public class Finder {
    public int findElement(int[] A, int n, int x) {
        // write code here
        int l = 0;
        int r = n-1,mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (A[mid] == x) {
                return mid;
            }else if(A[mid] < x){
                if (A[mid]<A[l]&&x>A[r])
                    r = mid -1;
                else
                l = mid+1;
            }else {
                if (A[mid]>A[r]&&x<A[l])
                    l = mid +1;
                else
                    r = mid-1;
            }
        }
        return -1;
    }
}
