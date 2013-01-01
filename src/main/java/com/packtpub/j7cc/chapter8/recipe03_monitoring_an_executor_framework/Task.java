package com.packtpub.j7cc.chapter8.recipe03_monitoring_an_executor_framework;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable {
    private long milliseconds;

    public Task(long milliseconds) {
        this.milliseconds = milliseconds;
    }

    @Override
    public void run() {
        System.out.printf("%s: Begin\n", Thread.currentThread().
                getName());
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%s: End\n", Thread.currentThread().
                getName());
    }
}
