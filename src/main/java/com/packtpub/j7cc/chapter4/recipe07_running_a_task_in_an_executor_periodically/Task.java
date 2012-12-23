package com.packtpub.j7cc.chapter4.recipe07_running_a_task_in_an_executor_periodically;


import java.util.Date;

public class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("%s: Starting at : %s\n", name, new Date());
    }
}
