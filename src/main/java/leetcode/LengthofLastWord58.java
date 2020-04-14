package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-14 上午11:50
 * <p>
 * 类说明：
 */
public class LengthofLastWord58 {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int index = s.length() - 1;
        //过滤空格
        while (true) {
            if (index < 0 || s.charAt(index) != ' ') {
                break;
            }
            index--;
        }
        //计算最后一个单词的长度
        for (int i = index; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }

}
