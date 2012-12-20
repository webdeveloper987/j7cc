package com.packtpub.j7cc.chapter3.recipe02_controlling_concurrent_access_to_multiple_copies_of_a_resource;

import com.packtpub.j7cc.chapter3.recipe01_controlling_concurrent_access_to_a_resource.PrintQueue;

public class Main {

    public static final int THREADS_COUNT = 10;

    public static void main(String[] args) {
        com.packtpub.j7cc.chapter3.recipe01_controlling_concurrent_access_to_a_resource.PrintQueue printQueue = new PrintQueue();
        Thread thread[] = new Thread[THREADS_COUNT];
        for (int i = 0; i < thread.length; i++) {
            thread[i] = new Thread(new Job(printQueue), "Thread" + i);
        }
        for (int i = 0; i < thread.length; i++) {
            thread[i].start();
        }
    }
}
