package com.pan.ThreadPoolExecutor;

/**
 * Created by FantasticPan on 2018/12/2.
 */
public class MyTask implements Runnable {

    private int taskNum;

    public MyTask(int taskNum) {
        this.taskNum = taskNum;
    }

    @Override
    public void run() {
        System.out.println("正在执行 task：" + taskNum);
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task" + taskNum + "执行完毕");
    }
}
