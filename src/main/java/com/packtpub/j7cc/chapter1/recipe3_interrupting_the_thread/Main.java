package com.packtpub.j7cc.chapter1.recipe3_interrupting_the_thread;

public class Main {
    private static final long SLEEP_TIMEOUT = 5000;

    public static void main(String[] args) {
        Thread task = new PrimeGenerator();
        task.start();
        try {
            Thread.sleep(SLEEP_TIMEOUT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        task.interrupt();
    }
}
