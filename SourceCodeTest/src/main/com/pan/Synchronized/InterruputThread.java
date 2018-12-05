package com.pan.Synchronized;

import java.util.concurrent.TimeUnit;

/**
 * Created by FantasticPan on 2018/12/5.
 */
public class InterruputThread {

    /**
     * 阻塞时调用
     * @param args
     */
    //public static void main(String[] args) throws InterruptedException {
    //
    //    Thread t1 = new Thread() {
    //        @Override
    //        public void run() {
    //            //while在try中，通过异常中断就可以退出run循环
    //            try {
    //                while (true) {
    //                    //当前线程处于阻塞状态，异常必须捕捉处理，无法往外抛出
    //                    TimeUnit.SECONDS.sleep(2);
    //                }
    //            } catch (InterruptedException e) {
    //                System.out.println("Interruted When Sleep");
    //                boolean interrupt = this.isInterrupted();
    //                //中断状态被复位
    //                System.out.println("interrupt:" + interrupt);
    //            }
    //        }
    //    };
    //
    //    t1.start();
    //    TimeUnit.SECONDS.sleep(2);
    //    //中断处于阻塞状态的线程
    //    t1.interrupt();
    //}

    /**
     * 运行时调用
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(){
            @Override
            public void run(){
                while(true){
                    //System.out.println("未被中断");

                    //判断当前线程是否被中断
                    if (this.isInterrupted()) {
                        System.out.println("线程中断");
                        break;
                    }
                }
                System.out.println("已跳出循环,线程中断!");
            }
        };
        t1.start();
        TimeUnit.SECONDS.sleep(2);
        t1.interrupt();
    }

    /**
     * 兼顾阻塞和运行状态的run方法中断
     */
    public void run() {
        try {
            while (!Thread.interrupted()) {
                TimeUnit.SECONDS.sleep(2);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
