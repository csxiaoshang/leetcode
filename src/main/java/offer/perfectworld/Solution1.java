package main.java.offer.perfectworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-14 下午7:05
 * <p>
 * 类说明：
 * ac
 */
public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] str1 = s.split(" ");
        int[] weights = new int[str1.length];
        for(int i=0;i<str1.length;i++){
            weights[i] = Integer.parseInt(str1[i]);
        }
        int maxLoad = Integer.parseInt(br.readLine());
        int count = countLeastBoat(weights,maxLoad);
        System.out.println(count);
    }

    public static int countLeastBoat(int[] weights, int maxLoad) {
        int count = 0;
        Arrays.sort(weights);
        int l = 0;
        int n = weights.length;
        int r = n-1;
        while (r >= l) {
            if (weights[r] + weights[l] <= maxLoad) {
                r--;
                l++;
            }else{
                r--;
            }
            count++;
        }
        return count;
    }
}
