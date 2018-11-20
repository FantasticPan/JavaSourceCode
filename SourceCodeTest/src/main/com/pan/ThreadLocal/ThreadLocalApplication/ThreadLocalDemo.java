package com.pan.ThreadLocal.ThreadLocalApplication;

import java.util.Random;

/**
 * Created by FantasticPan on 2018/11/20.
 */
public class ThreadLocalDemo implements Runnable {

    private static final ThreadLocal studentThreadLocal = new ThreadLocal();

    @Override
    public void run() {
        accessStudent();
    }

    public static void main(String[] args) {
        ThreadLocalDemo td = new ThreadLocalDemo();
        Thread t1 = new Thread(td, "a");
        Thread t2 = new Thread(td, "b");

        t1.start();
        t2.start();
    }

    private void accessStudent() {
        //获取当前线程名字
        String currentThreadName = Thread.currentThread().getName();
        System.out.println(currentThreadName + "is running!");
        Random random = new Random();
        int age = random.nextInt(100);
        System.out.println("thread " + currentThreadName + "set age to:" + age);
        Student student = getStudent();
        student.setAge(age);
        System.out.println("thread " + currentThreadName + " first read age is:" + student.getAge());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread " + currentThreadName + " second read age is:" + student.getAge());
    }

    private Student getStudent() {
        Student student = (Student) studentThreadLocal.get();
        if (student == null) {
            student = new Student();
            studentThreadLocal.set(student);
        }
        return student;
    }
}
