package com.packtpub.j7cc.chapter4.recipe08_cancelling_a_task_in_an_executor;

import java.util.concurrent.Callable;

public class Task implements Callable<String> {
    @Override
    public String call() throws Exception {
        while (true) {
            System.out.printf("Task: Test\n");
            Thread.sleep(100);
        }
    }
}

