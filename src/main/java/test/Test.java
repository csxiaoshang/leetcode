package main.java.test;

import com.sun.deploy.util.StringUtils;
import main.java.crackingtheCodingInterview.*;
import main.java.offer.FirstNotRepeatingChar;

import java.text.SimpleDateFormat;
import java.util.*;
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
/*        ReverseEqual reverseEqual = new ReverseEqual();
        List<String> stringList = new ArrayList<>();
        Map<String,String> map=new HashMap<>();
        while (sc.hasNext()) {
            String str = sc.next();
            stringList.add(str);
            map.put(str,str);
            System.out.println(map.toString());
        }*/

/*        List<Integer> list = new ArrayList();
        while (sc.hasNext()) {
            list.add(Integer.valueOf(sc.next()));
            if (list.size() == 4){
                BinInsert binInsert = new BinInsert();
                System.out.println(binInsert.binInsert(list.get(0),list.get(1),list.get(2),list.get(3)));
            }
        }*/

/*        while (sc.hasNext()) {
            BinDecimal binDecimal = new BinDecimal();
            System.out.println(binDecimal.printBin(Double.parseDouble(sc.next())));
        }*/

/*       int a = 1 << 5;
       int  b = a - 1;
        int mark = ~b;
        int n = 255;
        n = n & mark;
        System.out.println(n);*/

/*        Render render = new Render();
        int[] ints = new int[]{0,0,0,0,0,0,0,0};
        int[] res = render.renderPixel(ints, 0, 63);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }*/

/*        while (sc.hasNext()) {
            int i = sc.nextInt();

            System.out.println(i);
        }*/
        User user = new User();
        List<Integer> tem = user.num;
        tem.add(2);
        System.out.println(user.num);
        System.out.println(tem);

    }

    static class User{
        List<Integer> num = new ArrayList<Integer>();
    }
}


