package com.packtpub.j7cc.chapter1.recipe09_using_local_thread_variables;

import com.packtpub.j7cc.chapter1.recipe07_creating_and_running_a_daemon_thread.SafeTask;

import java.util.concurrent.TimeUnit;

public class SafeCore {
    public static void main(String[] args) {
        SafeTask safeTask = new SafeTask();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(safeTask);
            thread.start();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
