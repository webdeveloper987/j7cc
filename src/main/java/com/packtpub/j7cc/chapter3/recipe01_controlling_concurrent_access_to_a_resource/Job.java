package com.packtpub.j7cc.chapter3.recipe01_controlling_concurrent_access_to_a_resource;

public class Job implements Runnable {

    public Job(PrintQueue printQueue) {
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
