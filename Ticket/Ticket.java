package com.hqyj.mc.Test.Ticket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
    private Integer ticket = 100;
    //lock锁
    Lock lock = new ReentrantLock();
    public void run() {
        while(true){
            lock.lock();
                if (ticket>0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name+"正在卖"+ticket--);
                }
                lock.unlock();
            }
        }
    //建立锁对象
    //Object look = new Object();

    //String look = new String();
    //同步方法
/*    public void run() {
        while (true) {
            sellTicket();
        }
    }
    public synchronized  void sellTicket(){
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String name = Thread.currentThread().getName();
            System.out.println(name + "正在卖" + ticket--);
        } else
            return;
    }*/
    /*@Override
    public void run() {
        while(true){
            synchronized (look){
                if (ticket>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name+"正在卖"+ticket--);
                }else
                    return;
            }
            }
    }*/
    }
