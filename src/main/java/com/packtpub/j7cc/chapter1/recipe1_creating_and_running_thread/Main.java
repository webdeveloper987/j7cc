package com.packtpub.j7cc.chapter1.recipe1_creating_and_running_thread;


public class Main {
    private static final int NUMBER_OF_THREADS = 10;

    public static void main(String[] args) {
        for (int i = 1; i <= NUMBER_OF_THREADS; ++i) {
            Calculator calculator = new Calculator(i);
            Thread t = new Thread(calculator);
            t.start();
        }
    }
}
