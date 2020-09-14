package main.java.offer.tencent;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-9-14 下午4:38
 * <p>
 * 类说明：
 * <p>
 */
public class Solution11 {

    /**
     * 依次输入整数 k, a, b, c，得出结果
     * @param args
     */
    public static void main(String[] args) {
        Solution11 solution = new Solution11();
        int k = 4, a = 10, b = 15, c = 13;
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.println(solution.solution(k, a, b, c));
    }

    public int solution(int k, int a, int b, int c) {

        int r = (int) (Math.pow(2, k) - 1);
        return trace(1, r, a, b, c);
    }

    private int trace(int l, int r, int a, int b, int c) {

        int mid = l + (r - l) / 2;
        boolean isRoot = ((a - mid) * (b - mid) <= 0
                || (a - mid) * (c - mid) <= 0
                || (b - mid) * (c - mid) <= 0);
        if (isRoot) {
            return mid;
        }else if(a < mid){
            return trace(l, mid - 1, a, b, c);
        }else{
            return trace(mid + 1, r, a, b, c);
        }
    }
}
