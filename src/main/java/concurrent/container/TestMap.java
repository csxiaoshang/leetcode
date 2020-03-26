package main.java.concurrent.container;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-5 下午3:42
 * <p>
 * 类说明：
 */
public class TestMap {
    public static void main(String[] args) {
        ConcurrentHashMap map = new ConcurrentHashMap();
        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
    }
}
