package com.packtpub.j7cc.chapter7.recipe04_using_a_thread_factory_in_an_executor_object;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        MyThreadFactory threadFactory = new MyThreadFactory
                ("MyThreadFactory");
        ExecutorService executor = Executors.newCachedThreadPool
                (threadFactory);
        MyTask task = new MyTask();
        executor.submit(task);
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);
        System.out.printf("Main: End of the program.\n");
    }
}
