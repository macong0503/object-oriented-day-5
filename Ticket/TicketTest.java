package com.hqyj.mc.Test.Ticket;
/*
多线程安全问题：
 * 1.多个线程
 * 2.共享的数据
 * 3.对共享的数据有修改的操作（不能是查询的操作）
 */
public class TicketTest {
    public static void main(String[] args) {
        //创建线程任务对象
        Ticket ticket = new Ticket();
        //创建三个窗口对象
        Thread t1 = new Thread(ticket,"窗口一");
        Thread t2 = new Thread(ticket,"窗口二");
        Thread t3 = new Thread(ticket,"窗口三");
        //同时启动
        t1.start();
        t2.start();
        t3.start();
    }
}
