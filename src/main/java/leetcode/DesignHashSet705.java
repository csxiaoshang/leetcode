package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-1-1 下午6:32
 * <p>
 * 类说明：
 */
public class DesignHashSet705 {
    int[] value;

    public DesignHashSet705() {
        value = new int[1000000];
    }

    public void add(int key) {
        value[key] = 1;
    }

    public void remove(int key) {
        value[key] = 0;
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return value[key] == 1;
    }
}
