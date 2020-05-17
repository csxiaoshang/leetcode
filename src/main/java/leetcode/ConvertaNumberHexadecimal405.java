package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-16 上午11:05
 * <p>
 * 类说明：
 */
public class ConvertaNumberHexadecimal405 {
    public static void main(String[] args) {
        int num = -1;
        char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e',
                'f'};
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            System.out.println(num);
            sb.append(map[num & 0b1111]);
            num >>>= 4; // 因为考虑的是补码形式,因此符号位就不能有特殊的意义,需要使用无符号右移,左边填 0
        }
        System.out.println(sb.reverse().toString());
    }

    public String toHex(int num) {
        return Integer.toString(num, 16);
    }
}
