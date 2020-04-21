package main.java.offer.duxiaoman;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-20 下午4:22
 * <p>
 * 类说明： 滑动窗口
 * 时间限制：C/C++语言 1000MS；其他语言 3000MS
 * 内存限制：C/C++语言 65536KB；其他语言 589824KB
 * 题目描述：
 * 在机器学习中有一种流行的池化操作，而在池化操作中，3*3极大值池化应用十分广泛。什么是3*3极大值池化呢？设原矩阵是n*m的，则3*3极大值池化就是枚举矩阵中的所有3*3的子矩阵,分别求最大值并顺次拼接而成，处理过后的矩阵是(n-2)*(m-2)。
 *
 * 例如，原矩阵是[[1,2,3,4],[5,6,7,8],[9,10,11,12]],经过池化之后就变成[[11,12]]。
 *
 * 为了提高难度，选择的滑动窗口并不是3*3的，而是a*b的，由于输入可能是非常大的，原n*m的矩阵权值由以下公式计算得到，h(i,j)=i*j mod 10。(1<=i<=n,1<=j<=m)
 *
 * 由于输出矩阵也是一个很麻烦的事情，因此你只需输出经过a*b池化处理后的矩阵的元素之和即可
 *
 * 输入
 * 输入第一行包含四个正整数，n,m,a,b，分别表示原矩阵的行列数量和滑动窗口的行列数量。(1<=n,m,a,b<=1000)
 *
 * 输出
 * 输出仅包含一个整数，即新矩阵的元素之和。
 *
 *
 * 样例输入
 * 4 5 3 3
 * 样例输出
 * 54
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int[][] nums = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = (i+1)*(j+1)%10;
            }
        }
        int res = 0;
        for (int r = 0; r < n - a+1; r++) {
            for (int col = 0; col < m - b + 1; col++) {
                int max = Integer.MIN_VALUE;
                for (int i = r; i < r+a; i++) {
                    for (int j = col; j < b+col; j++) {
                        max = Math.max(max,nums[i][j]);
                    }
                }
                res+=max;
            }
        }
        System.out.println(res);
    }
}
