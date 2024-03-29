package com.packtpub.j7cc.chapter7.recipe04_using_a_thread_factory_in_an_executor_object;

import java.util.concurrent.ThreadFactory;

public class MyThreadFactory implements ThreadFactory {
    private int counter;
    private String prefix;

    public MyThreadFactory(String prefix) {
        this.prefix = prefix;
        counter = 1;
    }

    @Override
    public Thread newThread(Runnable r) {
        MyThread myThread = new MyThread(r, prefix + "-" + counter);
        counter++;
        return myThread;
    }
}
