package main.java.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-3 下午9:50
 * <p>
 * 类说明：
 */
public class ProductConsumer {
    // max 10
    private static volatile AtomicInteger i = new AtomicInteger(0);

    public void product(){
        while(i.get()<10){
            //生产
            System.out.println("product"+i);
            i.getAndIncrement();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void consumer(){
        while(i.get()>0){
            //消费
            System.out.println("consumer"+i);
            i.getAndDecrement();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    public static void main(String[] args){
        ExecutorService ex = Executors.newFixedThreadPool(3);
        ProductConsumer solution = new ProductConsumer();
        ex.execute(()->solution.product());
        ex.execute(()->solution.consumer());
        ex.execute(()->solution.consumer());
    }

}
