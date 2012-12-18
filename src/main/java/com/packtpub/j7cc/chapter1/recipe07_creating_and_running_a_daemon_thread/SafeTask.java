package com.packtpub.j7cc.chapter1.recipe07_creating_and_running_a_daemon_thread;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SafeTask implements Runnable {
    private static ThreadLocal<Date> startDate = new
            ThreadLocal<Date>() {
                protected Date initialValue() {
                    return new Date();
                }
            };

    @Override
    public void run() {
        System.out.printf("Starting Thread: %s : %s\n", Thread.
                currentThread().getId(), startDate.get());
        try {
            TimeUnit.SECONDS.sleep((int) Math.rint(Math.random() * 10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Thread Finished: %s : %s\n", Thread.
                currentThread().getId(), startDate.get());

    }
}
