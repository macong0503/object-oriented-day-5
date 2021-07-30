package com.hqyj.mc.Test.ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        //创建线程池对象
        ExecutorService service = Executors.newFixedThreadPool(2);
        //创建Runnable接口子类对象
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();
        //从线程池获取线程对象
        service.submit(t);
        //再使用线程池中的线程执行任务
        service.submit(t);
        service.submit(t);

        //关闭线程
        service.shutdown();
    }
}
