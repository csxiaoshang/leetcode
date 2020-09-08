package main.java.offer.tencent;

import java.util.*;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-9-6 下午8:11
 * <p>
 * 类说明：
 */
public class Solution7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] visit = new int[m];
        Set<Integer> res = new HashSet<>();
        ArrayList<Integer> initList = new ArrayList<>();
        ArrayList[] nums = new ArrayList[m];
        for (int i = 0; i < m; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            nums[i] = temp;
            int x = in.nextInt();
            for (int j = 0; j < x; j++) {
                int value = in.nextInt();
                if (value == 0) {
                    initList.add(i);
                }
                temp.add(value);
            }
        }
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i : initList) {
            visit[i] = 1;
            ArrayList<Integer> temp = nums[i];
            for (int j : temp) {
                queue.offer(j);
            }
        }
        while(!queue.isEmpty()){
            int tem = queue.poll();
            res.add(tem);
            for (int i = 0; i < m; i++) {
                if (visit[i] == 1) {
                    continue;
                }
                ArrayList<Integer> tempList = nums[i];
                if (tempList.contains(tem)) {
                    for (int j : tempList) {
                        queue.offer(j);
                    }
                    visit[i] = 1;
                }
            }
        }
        System.out.println(res.size());
    }
}
