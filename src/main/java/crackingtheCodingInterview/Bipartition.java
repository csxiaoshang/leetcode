package main.java.crackingtheCodingInterview;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-9-26 下午8:53
 * <p>
 * 类说明：
 */
public class Bipartition {
    public double[] getBipartition(Point[] A, Point[] B) {
        // write code here


        double x1=(A[1].x+A[0].x+A[2].x+A[3].x)/4;//开始直接就用A[1].x-A[0].x 结果到了测试的时候才发现顺序会变就找到了这种方法
        double y1=(A[1].y+A[0].y+A[2].y+A[3].y)/4;
        double x2=(B[0].x+B[1].x+B[2].x+B[3].x)/4;
        double y2=(B[0].y+B[1].y+B[2].y+B[3].y)/4;
        double k=(y1-y2)/(x1-x2);
        double s=y1-k*x1;
        double[] d =new double[2];
        d[0]=k;
        d[1]=s;
        return d;
    }
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
}
