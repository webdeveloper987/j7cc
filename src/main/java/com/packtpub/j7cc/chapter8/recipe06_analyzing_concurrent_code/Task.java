package com.packtpub.j7cc.chapter8.recipe06_analyzing_concurrent_code;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Task implements Runnable {
    private ReentrantLock lock;

    public Task(ReentrantLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            TimeUnit.SECONDS.sleep(1);
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}