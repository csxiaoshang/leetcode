package main.java.concurrent.thread;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-2 下午7:12
 * <p>
 * 类说明：
 */
public class CasLru {
    //　持有LinkedHashMap
    AtomicReference<LinkedHashMap> link;
    private void put(){
        for(;;){
            // 复制linkd
        }
    }
}
