package com.hqyj.mc.Test.HomeWork;
//编写一个Java程序，要求在同一个类中除main线程外，再开启一个线程，
//2个线程都循环执行20次。
public class Practice8 {
    public static void main(String[] args) {
        MyThread01 mt = new MyThread01();
        mt.start();

        for (int i = 1; i < 21; i++) {
            System.out.println("主线程循环的第"+i+"次");
        }
    }
}
class MyThread01 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 21; i++) {
            System.out.println("子线程循环的第"+i+"次");
        }
    }
}