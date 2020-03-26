package main.java.crackingtheCodingInterview;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-10-8 下午8:19
 * <p>
 * 类说明：
 */
public class DenseLine {

    public class Point {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public Point() {
            this.x = 0;
            this.y = 0;
        }
    }
    public double[] getLine(Point[] p, int n) {
        // write code here
        double[] ds = new double[2];
        int max = 2;
        int t;
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                double a = (p[i].y-p[j].y)/(p[i].x-p[j].x);
                double b = p[i].y - p[i].x*a;
                t = 2;
                for (int z=0; z<n ;z++){
                    if (z==i||z==j) continue;
                    if (a == (p[i].y-p[z].y)/(p[i].x-p[z].x)){
                        t++;
                    }
                }
                if (max < t){
                    t = max;
                    ds[0] = a;
                    ds[1] = b;
                }
            }
        }

        return ds;
    }
}
