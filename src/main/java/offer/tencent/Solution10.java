package main.java.offer.tencent;

import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-9-6 下午9:24
 * <p>
 * 类说明：
 */
public class Solution10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = 0;
        int n = in.nextInt();
        String s = in.next();
        char[] chars = s.toCharArray();
        Entry[] nums = new Entry[2*n];
        for (int i=0;i<2*n;i++){
            Entry temp = new Entry(chars[i], in.nextInt());
            nums[i] = temp;
        }
        for (int k = n; k > 0; k--) {
            int iR = 0;
            int flagR = 0;
            int sumR = 0;
            for (int i = 0; i < 2 * n - 1; i++) {
                if(nums[i].key == 'R' && nums[i].value == k){
                    iR = i;
                    flagR = 1;
                }

                if (flagR == 1){
                    Entry tem = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = tem;
                }

                if (flagR == 1 && nums[i].key == 'R' && nums[i].value < k){

                    Entry tem = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = tem;

                    sumR = i -iR + sumR;
                    iR = i;
                }
            }
            int iL = 0;
            int flagL = 0;
            int sumL = 0;
            for (int i = 0; i < 2 * n - 1; i++) {
                if(nums[i].key == 'B' && nums[i].value == k){
                    iL = i;
                    flagL = 1;
                }

                if (flagL == 1){
                    Entry tem = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = tem;
                }

                if (flagL == 1 && nums[i].key == 'B' && nums[i].value < k){

                    sumL = i -iL + sumL;
                    iL = i;
                }
            }
            res = res + sumL + sumR;
        }
        System.out.println(res);
    }
}
class Entry{
    char key;
    int value;

    public Entry(char key, int value) {
        this.key = key;
        this.value = value;
    }
}
