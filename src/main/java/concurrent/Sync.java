package main.java.concurrent;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-17 下午9:31
 * <p>
 * 类说明：
 */
public class Sync {

    private synchronized void sou() throws InterruptedException {
        notifyAll();
        System.out.println("asdf "+Thread.currentThread());
        Thread.sleep(1000);
        wait();
        System.out.println("asdf "+Thread.currentThread());
        Thread.sleep(1000);
        notify();
    }
    public static void main(String[] args) {
        Sync sync = new Sync();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sync.sou();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sync.sou();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
