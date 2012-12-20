package com.packtpub.j7cc.chapter3.recipe02_controlling_concurrent_access_to_multiple_copies_of_a_resource;

import com.packtpub.j7cc.chapter3.recipe01_controlling_concurrent_access_to_a_resource.PrintQueue;

public class Job implements Runnable {

    public Job(com.packtpub.j7cc.chapter3.recipe01_controlling_concurrent_access_to_a_resource.PrintQueue printQueue) {
        this.printQueue = printQueue;
    }

    private PrintQueue printQueue;

    @Override
    public void run() {
        System.out.printf("%s: Going to print a job\n", Thread.currentThread().getName());
        printQueue.printJob(new Object());
        System.out.printf("%s: The document has been printed\n", Thread.currentThread().getName());

    }
}
