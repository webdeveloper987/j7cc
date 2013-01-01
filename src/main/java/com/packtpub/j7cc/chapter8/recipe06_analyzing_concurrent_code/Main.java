package com.packtpub.j7cc.chapter8.recipe06_analyzing_concurrent_code;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        for (int i = 0; i < 10; i++) {
            Task task = new Task(lock);
            Thread thread = new Thread(task);
            thread.run();
        }
    }
}
