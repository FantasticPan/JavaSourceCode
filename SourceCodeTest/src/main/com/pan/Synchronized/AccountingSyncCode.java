package com.pan.Synchronized;

/**
 * Created by FantasticPan on 2018/12/4.
 */
public class AccountingSyncCode implements Runnable {

    static AccountingSyncCode instance = new AccountingSyncCode();
    static int i = 0;

    @Override
    public void run() {
        synchronized (instance) {
            for (int j = 0; j < 10000; j++) {
                i++;
            }
        }

        //this对象(代表当前实例)
        //synchronized(this){
        //    for(int j=0;j<1000000;j++){
        //        i++;
        //    }
        //}

        //class对象锁
        //synchronized(AccountingSync.class){
        //    for(int j=0;j<1000000;j++){
        //        i++;
        //    }
        //}
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
