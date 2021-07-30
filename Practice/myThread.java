package com.hqyj.mc.Test.Practice;

public class myThread implements Runnable{
   Account ac = new Account();

    public myThread(Account ac) {
        this.ac=ac;
    }

    @Override
    public void run() {
        ac.method(200);
    }
}
