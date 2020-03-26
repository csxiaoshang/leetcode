package main.java.concurrent.thread;

import main.java.test.test;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-26 下午8:47
 * <p>
 * 类说明： 测试内存可见性
 */
public class NoSivibilityVariable {
    private static boolean isOver = false;
    private static int i = 0;
    private static ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 5; j++) {
                    test();
                    System.out.println("thread1 ----- " + i);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 5; j++) {
                    test();
                    System.out.println("thread2 ----- " + i);
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main ----- true");
    }

    public static void test() {
        reentrantLock.lock();
        try {
            i++;
        } finally {
            reentrantLock.unlock();
        }
    }
}
