package main.java.concurrent.multithreadprint;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-29 下午5:29
 * <p>
 * 类说明： Condition solution
 */
public class PrintByCondition {
    ReentrantLock lock = new ReentrantLock();
    Condition a = lock.newCondition();
    Condition b = lock.newCondition();
    int i = 0;
    boolean flag = false;
    private class A implements Runnable {

        @Override
        public void run() {
                try {
                    lock.lock();
                    while (i < 10) {
                        if (flag) {
                            a.await();
                        }
                        flag = true;
                            System.out.println("A");
                            b.signal();
                        i++;
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    lock.unlock();
                }
        }
    }

    private class B implements Runnable {
        @Override
        public void run() {
                try {
                    lock.lock();
                    while (i<10) {
                        if (!flag){
                            b.await();
                        }
                        flag = false;
                        System.out.println("B");
                        a.signal();
                        i++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
    }

    public static void main(String[] args) {
        PrintByCondition print = new PrintByCondition();
        A a = print.new A();
        B b = print.new B();
        new Thread(a).start();
        new Thread(b).start();
    }

}
