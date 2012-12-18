package com.packtpub.j7cc.chapter1.recipe04_controlling_the_interruption_of_a_thread;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        FileSearch searcher = new FileSearch("/", ".bashrc");
        Thread thread = new Thread(searcher);
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(10);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
