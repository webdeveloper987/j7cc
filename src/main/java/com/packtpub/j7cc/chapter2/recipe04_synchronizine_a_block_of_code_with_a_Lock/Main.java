package com.packtpub.j7cc.chapter2.recipe04_synchronizine_a_block_of_code_with_a_Lock;


public class Main {

    public static final int NUMBER_OF_THREADS = 10;

    public static void main(String[] args) {
        PrintQueue printQueue = new PrintQueue();
        Thread thread[] = new Thread[10];
        for (int i = 0; i < NUMBER_OF_THREADS; i++) {
            thread[i] = new Thread(new Job(printQueue), "Thread " + i);
        }
        for (int i = 0; i < NUMBER_OF_THREADS; i++) {
            thread[i].start();
        }

    }

}
