package com.packtpub.j7cc.chapter7.recipe05_customizing_tasks_running_in_a_scheduled_thread_pool;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        MyScheduledThreadPoolExecutor executor = new
                MyScheduledThreadPoolExecutor(2);
        Task task = new Task();
        System.out.printf("Main: %s\n", new Date());
        executor.schedule(task, 1, TimeUnit.SECONDS);
        TimeUnit.SECONDS.sleep(3);
        task = new Task();
        System.out.printf("Main: %s\n", new Date());
        executor.scheduleAtFixedRate(task, 1, 3, TimeUnit.SECONDS);
        TimeUnit.SECONDS.sleep(10);
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);
        System.out.printf("Main: End of the program.\n");
    }
}
