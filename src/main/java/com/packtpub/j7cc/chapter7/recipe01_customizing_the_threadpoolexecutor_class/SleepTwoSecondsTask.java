package com.packtpub.j7cc.chapter7.recipe01_customizing_the_threadpoolexecutor_class;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class SleepTwoSecondsTask implements Callable<String> {
    public String call() throws Exception {
        TimeUnit.SECONDS.sleep(2);
        return new Date().toString();
    }
}

