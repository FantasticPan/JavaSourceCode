package com.pan.Synchronized;

/**
 * 修饰实例方法，作用于实例对象的锁
 * Created by FantasticPan on 2018/12/4.
 */
public class AccountingSync implements Runnable {

    //共享资源
    static int i = 0;

    /**
     * synchronized修饰实例方法
     */
    public synchronized void increase() {
        i++;
    }

    @Override
    public void run() {
        for (int j = 0; j < 5000; j++) {
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AccountingSync instance = new AccountingSync();
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
