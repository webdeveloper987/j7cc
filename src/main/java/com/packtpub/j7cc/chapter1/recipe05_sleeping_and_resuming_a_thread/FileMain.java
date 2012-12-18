package com.packtpub.j7cc.chapter1.recipe05_sleeping_and_resuming_a_thread;

import java.util.concurrent.TimeUnit;

public class FileMain {
    public static void main(String[] args) {
        FileClock clock=new FileClock();
        Thread thread=new Thread(clock);
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        };
        thread.interrupt();
    }
}
