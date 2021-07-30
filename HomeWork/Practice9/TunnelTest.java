package com.hqyj.mc.Test.HomeWork.Practice9;

public class TunnelTest {
    public static void main(String[] args) {
        Tunnel tunnel = new Tunnel();
        for (int i = 1; i < 11; i++) {
            Thread t = new Thread(tunnel,"行人"+i);
            t.start();
        }

    }
}
