package com.packtpub.j7cc.chapter7.recipe05_customizing_tasks_running_in_a_scheduled_thread_pool;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable {
    @Override
    public void run() {
        System.out.printf("Task: Begin.\n");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Task: End.\n");
    }
}