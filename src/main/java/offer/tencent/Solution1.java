package main.java.offer.tencent;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-26 下午8:02
 * <p>
 * 类说明：
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            LinkedList<String> queue = new LinkedList<>();
            int n = in.nextInt();
            while (n-- > -1) {
                String str = in.nextLine();
                if (str.startsWith("PUSH")) {
                    String s = str.split(" ")[1];
                    queue.offer(s);
                } else if (str.startsWith("TOP")) {
                    String s = queue.peek();
                    System.out.println(s==null?-1:s);
                } else if (str.startsWith("POP")) {
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    }else {
                        queue.pollFirst();
                    }
                } else if (str.startsWith("SIZE")) {
                    System.out.println(queue.size());
                }else {
                    queue.clear();
                }
            }
        }

    }
}
