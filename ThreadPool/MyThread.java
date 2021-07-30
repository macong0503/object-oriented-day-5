package com.hqyj.mc.Test.ThreadPool;

public class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("我想要一个美女");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"美女来了");
    }
}
