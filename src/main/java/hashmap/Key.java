package main.java.hashmap;

import java.util.Objects;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-1-28 下午8:25
 * <p>
 * 类说明：
 */
public class Key {
    int key;

    Key(int key){
        this.key = key;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key1 = (Key) o;
        return key == key1.key;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
