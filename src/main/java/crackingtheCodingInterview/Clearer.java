package main.java.crackingtheCodingInterview;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-6-12 下午9:49
 * <p>
 * 类说明：
 * 请编写一个算法，若N阶方阵中某个元素为0，则将其所在的行与列清零。
 */
public class Clearer {
    public int[][] clearZero(int[][] mat, int n) {
        // write code here
        Set<Integer> latSet=new HashSet<>();
        Set<Integer> lonSet=new HashSet<>();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (mat[i][j]==0){
                    latSet.add(i);
                    lonSet.add(j);
                }
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (latSet.contains(i)||lonSet.contains(j)){
                    mat[i][j]=0;
                }
            }
        }
        return mat;
    }
}
