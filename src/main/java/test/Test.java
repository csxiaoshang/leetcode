package main.java.test;

import com.sun.deploy.util.StringUtils;
import main.java.crackingtheCodingInterview.Differ;
import main.java.offer.FirstNotRepeatingChar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        while (sc.hasNext()) {
            String str=sc.next();
            Differ differ=new Differ();
            differ.checkDifferent(str);
        }
    }
}
