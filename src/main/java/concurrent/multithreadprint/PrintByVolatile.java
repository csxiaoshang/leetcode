package main.java.concurrent.multithreadprint;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-29 下午5:38
 * <p>
 * 类说明：
 */
public class PrintByVolatile {
    private static volatile AtomicInteger count = new AtomicInteger(1);
    private class A implements Runnable {

        @Override
        public void run() {
            while (true) {
                if (count.get() == 1) {
                    System.out.println("A");
                    count.getAndIncrement();
                }
            }
        }
    }

    private class B implements Runnable {
        @Override
        public void run() {
            while (true) {
                if (count.get() == 2) {
                    System.out.println("B");
                    count.getAndDecrement();
                }
            }
        }
    }

    public static void main(String[] args) {
        PrintByVolatile pv = new PrintByVolatile();
        A a = pv.new A();
        B b = pv.new B();
        new Thread(a).start();
        new Thread(b).start();
    }
}
