package main.java.crackingtheCodingInterview;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-10-21 下午5:18
 * <p>
 * 类说明：
 */
public class Permutation {
    public ArrayList<String> getPermutation(String A) {
        // write code here
        if (A == null || A.length() == 0) {
            return new ArrayList<>();
        }
        char[] ch = A.toCharArray();
        Arrays.sort(ch);
        ArrayList<String> tem = new ArrayList<>();
        tem.add(String.valueOf(ch[0]));
        for (int i = 1; i < ch.length; i++) {
            ArrayList<String> arrayList = new ArrayList<>();
                for (String s : tem) {
                    StringBuilder start = new StringBuilder(s);
                    start.insert(0, ch[i]);
                    arrayList.add(String.valueOf(start));
                    for (int j = 1; j < i; j++) {
                        StringBuilder sb = new StringBuilder(s);
                        sb.insert( j, ch[i]);
                        arrayList.add(sb.toString());
                }
                    StringBuilder end = new StringBuilder(s);
                    end.append(ch[i]);
                    arrayList.add(end.toString());
            }
            tem.removeAll(tem);
            tem.addAll(arrayList);
        }
        Collections.sort(tem);
        Collections.reverse(tem);
        return tem;
    }
}
