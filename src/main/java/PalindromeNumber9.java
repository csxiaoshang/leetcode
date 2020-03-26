package main.java;

import java.util.LinkedList;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-25 上午9:06
 * <p>
 * 类说明：
 */
public class PalindromeNumber9 {
    public static void main(String[] args) {
        PalindromeNumber9 pa = new PalindromeNumber9();
        System.out.println(pa.isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        return solution3(x);
    }

    /**
     * convert the integer to String
     *
     * @param x
     * @return
     */
    private boolean solution1(int x) {
        String a = String.valueOf(x);
        String b = new StringBuilder(a).reverse().toString();
        return a.equals(b);
    }

    /**
     * use stack
     *
     * @param x
     * @return
     */
    private boolean solution2(int x) {
        if (x < 0) {
            return false;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int tem = x;
        while (tem != 0) {
            int a = tem % 10;
            stack.push(a);
            tem = tem / 10;
        }
        while (x != 0 && !stack.isEmpty()) {
            int a = x % 10;
            int b = stack.pop();
            if (a != b) {
                return false;
            }
            x = x / 10;
        }
        return true;
    }

    /**
     * Since we divided the number by 10,
     * and multiplied the reversed number by 10,
     * when the original number is less than the reversed number,
     * it means we've processed half of the number digits.
     *
     * @param x
     * @return
     */
    private boolean solution3(int x) {
        if (x < 0||(x % 10 == 0 && x != 0)) {
            return false;
        }
        int res = 0;
        while (x != 0) {
            int a = x % 10;
            x = x / 10;
            res = res * 10 + a;
            if (x <= res) {
                break;
            }
        }
        return res == x||x == res/10;
    }
}

