package main.java.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-15 上午8:51
 * <p>
 * 类说明：
 */
public class PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        int lenth=numbers.length;
        for (int i=0;i<lenth;i++){
            arrayList.add(numbers[i]);
        }
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1=o1+""+o2;
                String s2=o2+""+o1;
                return s1.compareTo(s2);
            }
        });
        StringBuilder stringBuilder=new StringBuilder();
        arrayList.forEach(s->stringBuilder.append(s));
        return stringBuilder.toString();
    }
}
