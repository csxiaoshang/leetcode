package main.java.offer.tencent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-9-14 下午4:57
 * <p>
 * 类说明：
 * 进阶： 是否可以应对超大规模的情况，例如n > 10000000,m<100的场景
 */
public class Solution12 {

    /**
     * 输入x, y, n, m
     * @param args
     */
    public static void main(String[] args) {
        Solution12 solution = new Solution12();
        int x = 2, y = 3, n = 5, m = 2;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        n = in.nextInt();
        m = in.nextInt();
        System.out.println(solution.solution(x, y, n, m));
    }

    public List<List<Integer>> solution(int x, int y, int n, int m) {

        // 根据题目坐标从1开始的要求,处理x y 坐标
        if (x < 1 || y < 1) {
            return new ArrayList<>();
        }
        x--;
        y--;

        // 坐标和子矩阵长度越界时，返回空结果
        if (x + m > n || y + m > n) {
            return new ArrayList<>();
        }

        int[][] nums = new int[n][n];
        int level = 0;
        int val = 1;
        List<List<Integer>> res = new ArrayList<>();

        // 构造旋转数组
        while (level < n / 2) {
            // 下
            for (int i = level; i < n - level; i++) {
                if(nums[i][level] == 0){
                    nums[i][level] = val++;
                }
            }
            // 右
            for (int i = level; i < n - level; i++) {
                if (nums[n - level - 1][i] == 0) {
                    nums[n - level - 1][i] = val++;
                }
            }
            // 上
            for (int i = n - 1 - level; i >= level; i--) {
                if (nums[i][n - 1 - level] == 0) {
                    nums[i][n - 1 - level] = val++;
                }
            }

            for (int i = n - 1 - level; i >= 0; i--) {
                if (nums[level][i] == 0) {
                    nums[level][i] = val++;
                }
            }
            level++;
        }
        nums[n/2][n/2] = val;

        // 构造返回值
        for (int i = x; i < x + m; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = y; j < y + m; j++) {
                temp.add(nums[i][j]);
            }
            res.add(temp);
        }
        return res;
    }
}
