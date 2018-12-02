package com.pan.ThreadPoolExecutor.AchieveThreadPoolByMyself;

/**
 * Created by FantasticPan on 2018/12/2.
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        ThreadExecutor executor = new ThreadExecutor(3);
        for (int i = 0; i < 10; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程 " + Thread.currentThread().getName() + " 在帮我干活");
                }
            });
        }
        executor.shutdown();
    }
}
