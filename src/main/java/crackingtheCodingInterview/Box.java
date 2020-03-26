package main.java.crackingtheCodingInterview;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-10-30 下午8:22
 * <p>
 * 类说明：
 */
public class Box {
    public int getHeight(int[] w, int[] l, int[] h, int n) {
        // write code here
         int max = 0;
        for (int i = 0; i < n; i++) {
            int height = get(w,l,h,i);
            max = max>height?max:height;
        }
        return max;
    }

    int get(int[] w, int[] l, int[] h,int index) {
        int height =0;
        int max = 0;
        for (int i = 0; i < w.length; i++) {
            if (check(w[i], l[i], w[index], l[index])) {
                 height = get(w, l, h, i);
                max = max>height?max:height;
            }
        }
        if (height == 0) {
            return h[index];
        }else {
            return max+h[index];
        }


    }

    boolean check(int w1, int l1, int w2, int l2) {
        if (w1 < w2 && l1 < l2) {
            return true;
        }else {
            return false;
        }
    }
}
