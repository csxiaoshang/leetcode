package main.java.offer.perfectworld;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-14 下午7:44
 * <p>
 * 类说明：
 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int diamondCount = Integer.parseInt(input.nextLine().trim());
        int knapsackCapacity = Integer.parseInt(input.nextLine().trim());
        String[] weightsStr = input.nextLine().split(" ");
        int[] weights = new int[weightsStr.length];
        for(int i =0;i<weightsStr.length;i++){
            weights[i] = Integer.parseInt(weightsStr[i].trim());
        }
        String[] valuesStr = input.nextLine().split(" ");
        int[] values = new int[valuesStr.length];
        for(int i= 0;i<valuesStr.length;i++){
            values[i] = Integer.parseInt(valuesStr[i].trim());
        }
        System.out.println(method(diamondCount,knapsackCapacity,weights,values));
        input.close();
    }
    public static int method(int count, int capacity,int[] weights,int[] values) {
        return trace(count-1,capacity,weights,values);
    }

    public static int trace(int index, int capacity, int[] weights, int[] values) {
        if (index < 0 || capacity <= 0) {
            return 0;
        }
        int res = trace(index - 1, capacity, weights, values);
        if (weights[index] <= capacity) {
            res = Math.max(res, trace(index - 1, capacity - weights[index], weights, values) + values[index]);
        }
        return res;
    }
}
