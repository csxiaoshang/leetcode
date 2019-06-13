package main.java.test;

import com.sun.deploy.util.StringUtils;
import main.java.crackingtheCodingInterview.Differ;
import main.java.crackingtheCodingInterview.ReverseEqual;
import main.java.offer.FirstNotRepeatingChar;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

import static com.sun.deploy.util.StringUtils.*;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-16 下午10:22
 * <p>
 * 类说明：
 */
public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ReverseEqual reverseEqual = new ReverseEqual();
        List<String> stringList = new ArrayList<>();
        while (sc.hasNext()) {
            String str = sc.next();
            stringList.add(str);
            if (stringList.size()>1)
            System.out.println(reverseEqual.checkReverseEqual(stringList.get(0), stringList.get(1)));
        }

    }
}


