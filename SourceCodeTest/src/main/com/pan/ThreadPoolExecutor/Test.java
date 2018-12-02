package com.pan.ThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by FantasticPan on 2018/12/2.
 */
public class Test {

    public static void main(String[] args) {
        //ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,
                10,
                200,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(5));

        for (int i = 0; i < 15; i++) {
            MyTask task = new MyTask(i);
            executor.execute(task);
            System.out.println("线程池中线程数目：" + executor.getPoolSize() + "，队列中等待执行的任务数目："
                    + executor.getQueue().size() + "，已执行完别的任务数目：" + executor.getCompletedTaskCount());
        }
        executor.shutdown();
    }
}
