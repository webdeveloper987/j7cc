package com.packtpub.j7cc.chapter7.recipe07_customizing_tsks_running_in_the_fork_join_framework;

import java.util.Date;
import java.util.concurrent.ForkJoinTask;

public abstract class MyWorkerTask extends ForkJoinTask<Void> {
    private String name;

    public MyWorkerTask(String name) {
        this.name = name;
    }

    @Override
    public Void getRawResult() {
        return null;
    }

    @Override
    protected void setRawResult(Void value) {
    }

    @Override
    protected boolean exec() {
        Date startDate = new Date();
        compute();
        Date finishDate = new Date();
        long diff = finishDate.getTime() - startDate.getTime();
        System.out.printf("MyWorkerTask: %s : %d Milliseconds to complete.\n", name, diff);
        return true;
    }

    protected abstract void compute();

    public String getName() {
        return name;
    }
}