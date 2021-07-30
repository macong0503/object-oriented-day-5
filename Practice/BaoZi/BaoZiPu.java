package com.hqyj.mc.Test.Practice.BaoZi;

public class BaoZiPu extends Thread{
    private BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    public BaoZiPu(String name, BaoZi bz) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            synchronized (bz){
            if (bz.flag==true){
                try {
                    bz.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                System.out.println("包子吃完，开始做包子");
                int count = 0;
                if (count%2==0){
                    bz.setPi("红皮");
                    bz.setXian("红豆馅");
                }else {
                    bz.setPi("黄皮");
                    bz.setXian("黄豆馅");
                }
                System.out.println("包子做好，小董吃包子了");
                bz.flag = true;
                bz.notify();
            }
            }
        }
    }
}
