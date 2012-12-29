package com.packtpub.j7cc.chapter7.recipe04_using_a_thread_factory_in_an_executor_object;

import java.util.concurrent.TimeUnit;

public class MyTask implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
