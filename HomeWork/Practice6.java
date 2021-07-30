package com.hqyj.mc.Test.HomeWork;
//编写程序，在主线程中，循环输出“主线程执行”；在一条新线程中，循环输出“子线程执行”
public class Practice6 {
    public static void main(String[] args) {
        MyTread mt = new MyTread();
        mt.start();
        while (true){
            System.out.println("主线程循环");
        }
    }
}
class MyTread extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("子线程循环");
        }
    }
}
