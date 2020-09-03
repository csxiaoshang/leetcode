package main.java.concurrent.thread;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-9-2 上午10:32
 * <p>
 * 类说明：
 * 测试一个线程一直执行时，cpu的利用率
 *
 * 不是用Thread.sleep() cpu利用率达到200%
 * 使用Thread.sleep() cpu利用率在20%左右
 */
public class ThreadWhile {

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
           while (true){
               try {
                   Thread.sleep(100);
                   System.out.println("thread1");
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        });

        Thread thread2 = new Thread(() -> {
            while (true){
                try {
                    Thread.sleep(100);
                    System.out.println("thread2");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
