package main.java;

import java.util.Collections;
import java.util.Arrays;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-5 上午11:00
 * <p>
 * 类说明：
 */
public class ReverseWordsinaString151 {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}
