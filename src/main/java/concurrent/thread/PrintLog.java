package main.java.concurrent.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-8 下午8:21
 * <p>
 * 类说明： 多线程打印日志
 */
public class PrintLog {
    private static volatile AtomicInteger id = new AtomicInteger(0);
    private static CountDownLatch c = new CountDownLatch(1);
    private class A implements Runnable {
        @Override
        public void run() {
            try {
                c.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread a id :" + id.getAndIncrement());
            }
        }
    }

    private class B implements Runnable {

        @Override
        public void run() {
            try {
                c.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 10; i++) {

                System.out.println("Thread b id :" + id.getAndIncrement());
            }
        }
    }

    public static void main(String[] args) {
        PrintLog pl = new PrintLog();
        new Thread(pl.new A()).start();
        new Thread(pl.new B()).start();
        c.countDown();
    }
}
