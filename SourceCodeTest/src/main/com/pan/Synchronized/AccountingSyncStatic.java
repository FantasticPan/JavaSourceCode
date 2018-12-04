package com.pan.Synchronized;

/**
 * 修饰静态方法，作用于类对象的锁
 * Created by FantasticPan on 2018/12/4.
 */
public class AccountingSyncStatic implements Runnable {

    static int i = 0;

    /**
     * error sample
     */
    //public synchronized void increase() {
    //    i++;
    //}

    /**
     * right sample
     */
    public synchronized static void increase() {
        i++;
    }


    @Override
    public void run() {
        for (int j = 0; j < 1000000; j++) {
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //new新实例
        Thread t1=new Thread(new AccountingSyncStatic());
        //new新实例
        Thread t2=new Thread(new AccountingSyncStatic());
        t1.start();
        t2.start();
        //join含义:当前线程A等待thread线程终止之后才能从thread.join()返回
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
