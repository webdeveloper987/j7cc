package com.packtpub.j7cc.chapter1.recipe02_getting_and_setting_thread_information;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static final int NUMBER_OF_THREADS = 10;

    public static void main(String[] args) {
        Thread threads[] = new Thread[NUMBER_OF_THREADS];
        Thread.State status[] = new Thread.State[NUMBER_OF_THREADS];
        for (int i = 0; i < NUMBER_OF_THREADS; ++i) {
            threads[i] = new Thread(new Calculator(i));
            if ((i % 2) == 0) {
                threads[i].setPriority(Thread.MAX_PRIORITY);
            } else {
                threads[i].setPriority(Thread.MIN_PRIORITY);
            }
            threads[i].setName("Thread " + i);
        }
        try (FileWriter file = new FileWriter("./data/log.txt");
             PrintWriter pw = new PrintWriter(file);) {
            // write status of threads, now it becomes NEW
            for (int i = 0; i < NUMBER_OF_THREADS; ++i) {
                pw.println("Main: Status of Thread " + i + " : " + threads[i].getState());
                status[i] = threads[i].getState();
            }
            // start threads
            for (int i = 0; i < NUMBER_OF_THREADS; ++i) {
                threads[i].start();
            }
            // check status until all threads finished
            boolean finish = false;
            while (!finish) {
                for (int i = 0; i < NUMBER_OF_THREADS; ++i) {
                    if (threads[i].getState() != status[i]) {
                        writeThreadInfo(pw, threads[i], status[i]);
                        status[i] = threads[i].getState();
                    }
                }
                finish = true;
                for (int i = 0; i < NUMBER_OF_THREADS; ++i) {
                    finish = finish && (threads[i].getState() == Thread.State.TERMINATED);
                }
            }
        } catch (IOException e) {
            //
        }

    }

    private static void writeThreadInfo(PrintWriter pw, Thread thread, Thread.State state) {
        pw.printf("Main : Id %d - %s\n", thread.getId(), thread.getName());
        pw.printf("Main : Priority: %d\n", thread.getPriority());
        pw.printf("Main : Old State : %s\n", state);
        pw.printf("Main : New State : %s\n", thread.getState());
        pw.printf("Main : *************************************************");
    }
}
