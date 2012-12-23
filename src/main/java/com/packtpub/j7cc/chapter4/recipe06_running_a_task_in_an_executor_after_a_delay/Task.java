package com.packtpub.j7cc.chapter4.recipe06_running_a_task_in_an_executor_after_a_delay;

import java.util.Date;
import java.util.concurrent.Callable;

public class Task implements Callable<String> {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public String call() throws Exception {
        System.out.printf("%s: Starting at : %s\n", name, new Date());
        return "Hello, world";
    }
}