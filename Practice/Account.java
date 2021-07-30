package com.hqyj.mc.Test.Practice;

import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private Integer zhanghao;
    private Integer yue;
//    Object o = new Object();
    Lock lock = new ReentrantLock();

    public Account() {
    }

    public Account(Integer zhanghao, Integer yue) {
        this.zhanghao = zhanghao;
        this.yue = yue;
    }

    public Integer getZhanghao() {
        return zhanghao;
    }

    public void setZhanghao(Integer zhanghao) {
        this.zhanghao = zhanghao;
    }

    public Integer getYue() {
        return yue;
    }

    public void setYue(Integer yue) {
        this.yue = yue;
    }


    public void method(int money) {
        //synchronized (o) {
        //lock.lock();
            if (yue > money) {
                Integer yue = this.getYue();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer yue2 = yue - money;
                this.setYue(yue2);
                String name = Thread.currentThread().getName();
                System.out.println(name + "取款金额为：" + money + "，剩余金额为：" + yue2);
            } else
                System.out.println("余额不足");
           // lock.unlock();
        }
        }
    //}

