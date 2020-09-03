package main.java.concurrent.deadlock;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-9-1 上午10:38
 * <p>
 * 类说明：
 *
 * 使用synchronized 实现线程死锁
 */
public class ThreadLockA {
    public static void main(String[] args) {

        ThreadLockA a = new ThreadLockA();
        ThreadLockA b = new ThreadLockA();

        Thread thread1 = new Thread(() -> {
            synchronized (b){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread1 sleep end");
                synchronized (a){
                    System.out.println("Thread1 get a successfAully");
                }
            }
        });
        Thread thread2 = new Thread(() ->{
            synchronized (a){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread2 sleep end");
                synchronized (b) {
                    System.out.println("Thread2 get b successfully");
                }
            }
        });

        thread1.start();
        thread2.start();

    }


}
