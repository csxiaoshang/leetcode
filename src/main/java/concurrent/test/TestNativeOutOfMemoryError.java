package main.java.concurrent.test;

import java.util.concurrent.CountDownLatch;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-27 下午5:27
 * <p>
 * 类说明： 测试系统最大线程数量
 */
public class TestNativeOutOfMemoryError {
    public static void main(String[] args) {

        for (int i = 0;; i++) {
            System.out.println("i = " + i);
            new Thread(new HoldThread()).start();
        }
    }

}

class HoldThread extends Thread {
    CountDownLatch cdl = new CountDownLatch(1);

    public HoldThread() {
        this.setDaemon(true);
    }

    @Override
    public void run() {
        try {
            cdl.await();
        } catch (InterruptedException e) {
        }
    }
}
