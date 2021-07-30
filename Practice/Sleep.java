package com.hqyj.mc.Test.Practice;
//实现一个计数器，输出到100，每隔一秒输出一次，每输出十个输出一行字符串
public class Sleep {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        Thread t =new Thread(mt);
        t.start();
    }

}
class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <101 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
            if (i%10==0)
                System.out.println("aaa");
        }
    }
}