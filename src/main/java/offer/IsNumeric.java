package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-5-4 下午2:52
 * <p>
 * 类说明：
 */
public class IsNumeric {
    public boolean isNumeric(char[] str) {
        String string = String.valueOf(str);
        return string.matches("[\\+\\-]?\\d*(\\.\\d+)?([eE][\\+\\-]?\\d+)?");
    }
}
