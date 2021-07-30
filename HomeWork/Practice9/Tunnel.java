package com.hqyj.mc.Test.HomeWork.Practice9;
/*
* 1.定义一个隧道类，实现Runnable接口：
		1.1 定义一个变量，用来记录通过隧道的人数；
		1.2 重写Runnable的run方法；
		1.3 定义一个同步方法，模拟每个人通过隧道需要5秒钟：
			1.3.1 子线程睡眠5秒钟，模拟每个人通过隧道需要5秒钟；
			1.3.2 改变通过的人次；
			1.3.3 打印线程名称及其通过隧道的顺序，模拟人通过隧道及其顺序；
		1.4 调用通过隧道的方法；
* */
public class Tunnel implements Runnable {
private Integer count=0;
    @Override
    public void run() {
        method();

    }
    public synchronized void method(){
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
        System.out.println(Thread.currentThread().getName()+"第"+count+"通过隧道");
    }
}
