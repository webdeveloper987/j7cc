package com.packtpub.j7cc.chapter1.recipe03_interrupting_the_thread;

import com.packtpub.j7cc.chapter1.recipe03_interrupting_the_thread.PrimeGenerator;

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
