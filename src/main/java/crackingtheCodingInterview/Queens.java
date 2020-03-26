package main.java.crackingtheCodingInterview;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-10-28 下午9:45
 * <p>
 * 类说明：
 */
/*public class Queens {
    public int nQueens(int n) {
        // write code here
        int res = 0;
        int[] tem = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            tem[index] = i;
           count(tem,index+1,n,res);
        }
        return res;
    }

    void count(int[] t, int index,int n ,int res) {
        if (index == n) {
            res++;
            return ;
        }
        for (int i = 0; i < n; i++) {
            if (check(t, index, i)) {
                t[index] = i;
                count(t, index + 1, n, res);
            }
        }
    }

    boolean check(int[] t,int index,int i){
        for (int j = 0; j < index; j++) {
            int temp = t[j];
            if (temp == i)
                return false;
            if (Math.abs(j - i) == Math.abs(temp - i))
                return false;
        }
        return true;
    }
}*/
public class Queens {
    public int nQueens(int n) {
        // write code here
        int[] cols = new int[n];
        int[] num = { 0 };
        for (int i = 0; i < n; i++) {
            cols[0] = i;//第一行皇后的位置
            getCount(cols, 1, num);

        }
        return num[0];
    }


    public static void getCount(int[] cols, int row, int[] num) {
        if (row == (cols.length)) {
            num[0]++;
            return;
        }
        for (int i = 0; i < cols.length; i++) {
            if (checkValid(cols, row, i)) {
                cols[row] = i;
                getCount(cols, row + 1, num);
            }
        }

    }

    private static boolean checkValid(int[] cols, int row, int col) {
        for (int i = 0; i < row; i++) {
            int temp = cols[i];
            if (temp == col)
                return false;
            if (Math.abs(row - i) == Math.abs(temp - col))
                return false;
        }
        return true;
    }
}
