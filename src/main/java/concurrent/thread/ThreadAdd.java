package main.java.concurrent.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-26 下午4:36
 * <p>
 * 类说明：
 */
public class ThreadAdd {
    private int i;
    private CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
    private CountDownLatch countDownLatch = new CountDownLatch(1);
    protected class Tadd implements Runnable{
        @Override
        public void run() {
            System.out.println("add await");
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("add start");
            for (int j = 0;j<20;j++){
                System.out.println("add "+i++);
            }
        }
    }
    protected class TDcre implements Runnable{

        @Override
        public void run() {
            System.out.println("sub await");
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("sub start");
            for (int j = 0;j<20;j++){

                System.out.println("sub "+i--);
            }
        }
    }

    public static void main(String[] args) {
        ThreadAdd threadAdd = new ThreadAdd();
        Tadd add = threadAdd.new Tadd();
        TDcre sub = threadAdd.new TDcre();
        Thread addThread = new Thread(add);
        Thread subThread = new Thread(sub);
        addThread.start();
        subThread.start();
        threadAdd.countDownLatch.countDown();
    }
}
