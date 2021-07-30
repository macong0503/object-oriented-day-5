package com.hqyj.mc.Test.Practice;

public class Test {
    public static void main(String[] args) {
        Account ac = new Account(123,1000);
        myThread mt = new myThread(ac);
        myThread mt1 = new myThread(ac);
        Thread t1 = new Thread(mt,"小胡");
        Thread t2 = new Thread(mt1,"小董");

        t1.start();
        t2.start();
    }
}
