package com.pan.ThreadPoolExecutor.AchieveThreadPoolByMyself;

import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by FantasticPan on 2018/12/2.
 */
public class ThreadExecutor {

    //创建
    private volatile boolean RUNNING = true;
    private static BlockingQueue<Runnable> queue = null;
    private final HashSet<Worker> works = new HashSet<>();
    private final List<Thread> threadList = new ArrayList<>();

    //工作线程数
    int poolSize = 0;
    //核心线程数（创建了多少个工作线程）
    int coreSize = 0;

    boolean shutdown = false;

    public ThreadExecutor(int poolSize) {
        this.poolSize = poolSize;
        queue = new LinkedBlockingQueue<>(poolSize);
    }

    public void execute(Runnable runnable) throws InterruptedException {
        if (runnable == null) {
            throw new NullPointerException();
        }
        if (coreSize < poolSize) {
            addThread(runnable);
        }else {
            queue.put(runnable);
        }
    }

    public void addThread(Runnable runnable) {
        coreSize++;
        Worker worker = new Worker(runnable);
        works.add(worker);
        Thread t = new Thread(worker);
        threadList.add(t);
        t.start();
    }

    public void shutdown() {
        RUNNING = false;
        if (!works.isEmpty()) {
            for (Worker worker : works) {
                worker.interruptIfIdle();
            }
        }
        shutdown = true;
        Thread.currentThread().interrupt();
    }

    class Worker implements Runnable {

        public Worker(Runnable runnable) {
            queue.offer(runnable);
        }

        @Override
        public void run() {
            while (RUNNING) {
                if (shutdown) {
                    Thread.interrupted();
                }
                Runnable task = null;
                try {
                    task = getTask();
                    task.run();
                } catch (InterruptedIOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public Runnable getTask() throws InterruptedIOException, InterruptedException {
            return queue.take();
        }

        public void interruptIfIdle() {
            for (Thread thread : threadList) {
                System.out.println(thread.getName() + " interrupt");
                thread.interrupt();
            }
        }
    }
}
