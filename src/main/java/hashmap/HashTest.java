package main.java.hashmap;

import java.util.HashMap;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-1-28 下午8:26
 * <p>
 * 类说明：
 */
public class HashTest {
    public static void main(String[] args) {
        HashMap<Key, Integer> map = new HashMap<>();
        map.put(new Key(1), 1);
        Key key = new Key(1);
        System.out.println(map.get(key));
    }
}
