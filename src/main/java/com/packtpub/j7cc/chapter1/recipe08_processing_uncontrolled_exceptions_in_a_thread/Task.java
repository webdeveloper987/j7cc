package com.packtpub.j7cc.chapter1.recipe08_processing_uncontrolled_exceptions_in_a_thread;

public class Task implements Runnable {
    @Override
    public void run() {
        int numero = Integer.parseInt("TTT");
    }
}

