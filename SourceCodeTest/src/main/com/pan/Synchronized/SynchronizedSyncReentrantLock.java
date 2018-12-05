package com.pan.Synchronized;

/**
 * Synchronized重入锁
 * Created by FantasticPan on 2018/12/5.
 */
public class SynchronizedSyncReentrantLock implements Runnable {

    static SynchronizedSyncReentrantLock instance = new SynchronizedSyncReentrantLock();

    static int i = 0;
    static int j = 0;

    @Override
    public void run() {
        for (int j = 0; j < 1000000; j++) {

            //this,当前实例对象锁
            synchronized (this) {
                i++;
                increase();//synchronized的可重入性
            }
        }
    }

    public synchronized void increase() {
        j++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("i= " + i);
        System.out.println("j= " + j);
    }
}
