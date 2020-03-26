package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-25 下午10:48
 * <p>
 * 类说明：
 */
public class UniqueBinarySearchTrees96 {
    public int numTrees(int n) {
        return solution1(n);
    }
    private int solution1(int n){
        if (n == 0){
            return 0;
        }
        return getTree(1,n);
    }
    private int getTree(int s,int e){
        int res = 0;
        if(s >= e){
            return 1;
        }
        for (int i =s;i<=e;i++){
            int left = getTree(s, i - 1);
            int right = getTree(i + 1, e);
            res +=left*right;
        }
        return res;
    }
}
