package main.java.concurrent.multithreadprint;

import javafx.beans.binding.ObjectExpression;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-29 下午10:59
 * <p>
 * 类说明：
 */
public class PrintBySync {
     static Object obj = new Object();
     static boolean flag = false;
     static int i = 0;
    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (obj){
                while (i < 10) {
                    if(flag){
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        i++;
                        flag = true;
                        System.out.println("A");
                        obj.notify();
                    }
                    }

            }
        }).start();
        new Thread(() -> {
            synchronized (obj){
                while (i < 10) {
                    if(!flag){
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        i++;
                        flag = false;
                        System.out.println("B");
                        obj.notify();
                    }
                }
            }
        }).start();
    }
}
