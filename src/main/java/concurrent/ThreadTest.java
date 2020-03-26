package main.java.concurrent;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-21 下午8:37
 * <p>
 * 类说明：
 */
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("new thread");

            }
        });
        Worker worker = new Worker();
        worker.runWork();

    }
}

class Worker{
    Thread thread;
    Worker(){
        thread= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("default thread");
            }
        });
    }

    public void runWork(){
        System.out.println("worker"+Thread.currentThread());

    }
}
