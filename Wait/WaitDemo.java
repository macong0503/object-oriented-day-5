package com.hqyj.mc.Test.Wait;
/*
Waiting状态在API中介绍为：
一个正在无限期等待另一个线程执行一个特别的（唤醒）动作的线程处于这一状态
注意：
1.wait和notify方法，它是Object里面的方法（笔试题：以下哪些方法是/不是Object/Thread类里面的方法？）
2.wait和notify方法必须由同一个锁对象调用
3.wait和notify方法必须在同步代码块或者同步函数中使用
 */
public class WaitDemo {
    private static Object obj = new Object();
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() +
                                "获取锁对象，调用wait方法进入Waiting状态，释放锁对象");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() +
                                "从Waiting状态醒来，获取对象锁，继续执行");
                    }
                }
            }
        },"等待线程").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println("等待三秒");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        obj.notify();
                        System.out.println(Thread.currentThread().getName()+
                                "---获取到对象锁，调用notify方法，释放对象锁");
                    }
                }
            }
        },"唤醒线程").start();
    }
}
