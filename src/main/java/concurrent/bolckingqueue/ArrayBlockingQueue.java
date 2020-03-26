package main.java.concurrent.bolckingqueue;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-25 下午10:56
 * <p>
 * 类说明： 手写堵塞队列
 */
public class ArrayBlockingQueue<E> {

    private final Object[] items;
    private volatile int count;
    private volatile int size;
    private ReentrantLock lock = new ReentrantLock();
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();
    public ArrayBlockingQueue(int size) {
        this.items = new Object[size];
        this.size = size;
    }

    public boolean offer(E e){
        final ReentrantLock lock = this.lock;
        lock.lock();
        try {
            if (count == size){
                return false;
            }else{
                enque(e);
            }
        }finally {
            lock.unlock();
        }
        return true;
    }

    public E poll(){
        final ReentrantLock lock = this.lock;
        lock.lock();
        try {
            if (count == 0){
                return null;
            }else{
                return deque();
            }
        }finally {
            lock.unlock();
        }
    }

    private E deque(){
        try {
            notEmpty.await();
            return (E) items[--count];
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
    private void enque(E e){
        try {
            notFull.await();
            items[count++] = e;
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }finally {
            notEmpty.signal();
        }
    }
}
