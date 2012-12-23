package com.packtpub.j7cc.chapter4.recipe09_controlling_a_task_finishing_in_an_executor;


import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ResultTask extends FutureTask<String> {
    private String name;

    public ResultTask(Callable<String> callable) {
        super(callable);
        this.name = ((ExecutableTask) callable).getName();
    }

    @Override
    protected void done() {
        if (isCancelled()) {
            System.out.printf("%s: Has been canceled\n", name);
        } else {
            System.out.printf("%s: Has finished\n", name);
        }
    }
}