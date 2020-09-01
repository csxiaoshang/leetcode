package main.java.offer.yuanfudao;

import java.util.*;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-8-22 下午6:57
 * <p>
 * 类说明：
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            nums[i] = a;
        }
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> low = new ArrayList<>();
        int k = 1;
        int preI = 0;
        for (int i = 0; i < n; ) {

            if (i + k > n) {
                for (int j = i; j < n; j++) {
                    low.add(nums[j]);
                }
                int lowSize = low.size()/2 +1;
                for (int j = preI+lowSize; j < i - 1; j++) {
                    low.add(nums[j]);
                }
                break;
            }

            if (k == 1) {
                left.add(nums[i]);
            } else {
                left.add(nums[i]);
                right.add(nums[i + k - 1]);
            }
            preI = i;
            i = i + k;
            k = k * 2;
        }
        Collections.reverse(right);
        for (int i : left) {
            System.out.print(i+" ");
        }
        for (int i : low) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < right.size(); i++) {
            if (i == 0) {
                System.out.print(right.get(i));
            }else {
                System.out.print(" " + right.get(i));
            }
        }
    }

    public void problem3() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> queue;
        if (k == 0) {
            queue = new PriorityQueue<>(1);
            queue.offer(0);
        } else {
            queue = new PriorityQueue<>(k);
        }
        int l = 1;
        while (l < n) {
            if (l == n - 1) {
                list.add(l);
                queue.offer(l);
                break;
            }
            int mid = (l + n) / 2;
            list.add(mid);
            queue.offer(mid);
            l = mid + 1;
        }
        int sum = 0;
        int sumK = 0;
        for (int i : list) {
            sum += i;
        }
        for (int i = 0; i < k; i++) {
            sumK += queue.poll();
        }
        System.out.println(sum - sumK);
    }
}
