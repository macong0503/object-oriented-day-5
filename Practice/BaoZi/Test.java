package com.hqyj.mc.Test.Practice.BaoZi;

public class Test {
    public static void main(String[] args) {
        BaoZi bz =new BaoZi();
        BaoZiPu bzp = new BaoZiPu("小胡包子",bz);
        ChiHuo ch = new ChiHuo("小董",bz);
        bzp.start();
        ch.start();
    }
}
