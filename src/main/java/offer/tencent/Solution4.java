package main.java.offer.tencent;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-26 下午8:38
 * <p>
 * 类说明：
 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedList<String> stack1 = new LinkedList<>();
        LinkedList<String> stack2 = new LinkedList<>();
        int count = 0;
        while (in.hasNextLine()) {
            String str = in.nextLine();
            if (str.isEmpty()) {
                continue;
            }
            if (str.startsWith("add")) {
                stack2.push(str.split(" ")[1]);
            } else if (str.startsWith("poll")) {
                if (stack1.isEmpty()) {
                    while (!stack2.isEmpty()) {
                        stack1.push(stack2.pop());
                    }
                }
                    stack1.pop();
            }else {
                if (stack1.isEmpty()) {
                    while (!stack2.isEmpty()) {
                        stack1.push(stack2.pop());
                    }
                }
                System.out.println(stack1.peek());
            }
            if (++count == n) {
                break;
            }
        }
    }
}
