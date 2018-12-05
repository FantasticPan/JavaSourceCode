package com.pan.Lock;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by FantasticPan on 2018/12/5.
 */
public class LockTest {

    private ArrayList<Integer> arrayList = new ArrayList<>();
    private Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        final LockTest test = new LockTest();

        new Thread(() -> test.insert(Thread.currentThread())).start();
        new Thread(() -> test.insert(Thread.currentThread())).start();
    }

    public void insert(Thread thread) {
        lock.lock();
        try {
            System.out.println(thread.getName() + "得到了锁");
            for (int i = 0; i < 5; i++) {
                arrayList.add(i);
            }
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            System.out.println(thread.getName() + "释放了锁");
            lock.unlock();
        }
    }
}
