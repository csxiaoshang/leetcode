package main.java.test;

import main.java.ArrangingCoins;
import main.java.demo.MyConfig;

import java.util.*;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-16 下午10:22
 * <p>
 * 类说明：
 */
public class Test {
    static int b;

    public static void main(String[] args) throws InterruptedException {
        String s = "asdfghjkl";
        System.out.println(s);
        TestConfig testConfig = new TestConfig();
        testConfig.wait(1000);
        System.out.println(s);
        System.out.println(s);
/*        long time = System.currentTimeMillis() + 6000;
        for(int i = 0;i<5;i++){
            long res = time - System.currentTimeMillis();
            System.out.println("res "+res);
            Thread.sleep(1000);
        }*/
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

/*        User user = new User();
        List<Integer> tem = user.num;
        tem.add(2);
        System.out.println(user.num);
        System.out.println(tem);*/
        // System.out.println(String.format("%04d", 12));

/*        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        queue.add(1);
        queue.add(2);
        queue.add(3);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        System.out.println(s.equals("asdfa"));
        }*/
/*        Byte[] bytes = new Byte[];
        String s = ;*/
/*        String s = "123456789";
        System.out.println(s.substring(3,6));*/
/*        int[][] in = {{1,2,3},{4,5,6}};
        FinderElement f = new FinderElement();
        int[] res = f.findElement(in,2,3,6);
        System.out.println(res[0]+"+"+res[1]);*/
        //System.out.println("b :"+b);
/*        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        String s = "aaa";
        list.add(s);
        list.add("bbb");
        map.put("list", list);
        System.out.println(list.contains(s));
        System.out.println(list);
        System.out.println("map"+map.get("list").contains(s));
        System.out.println("map"+map.get("list").contains("ccc"));*/

/*        String s ="";
        if(s!=null && !"".equals(s)) {
            Integer res = Integer.parseInt(s);
        }*/

/*        String timeEnd = "2091225091010";
        Calendar calendar = Calendar.getInstance();
        int year = Integer.parseInt(timeEnd.substring(0, 4));
        int month = Integer.parseInt(timeEnd.substring(4, 6)) - 1;
        int day = Integer.parseInt(timeEnd.substring(6, 8));
        int hour = Integer.parseInt(timeEnd.substring(8, 10));
        int min = Integer.parseInt(timeEnd.substring(10, 12));
        int second = Integer.parseInt(timeEnd.substring(12,14));
        calendar.set(year, month, day, hour, min, second);*/
/*        int[][] arr = {{1, 2, 3},{1,2,1}};
        System.out.println(arr);
        char c = '2';
        int res = c - '0';
        System.out.println(res);*/
/*        String a[] ="string";
        modify(a);
        System.out.println(a);*/

    }


}


