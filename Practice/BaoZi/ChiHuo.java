package com.hqyj.mc.Test.Practice.BaoZi;

public class ChiHuo extends Thread{
    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    public ChiHuo(String name, BaoZi bz) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("小董吃" + bz.getPi() + bz.getXian() + "包子");
                    bz.flag = false;
                    bz.notify();
                }
            }
        }
    }
}
