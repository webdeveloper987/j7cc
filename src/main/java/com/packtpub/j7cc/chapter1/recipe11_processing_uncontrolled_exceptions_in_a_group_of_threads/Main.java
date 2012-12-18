package com.packtpub.j7cc.chapter1.recipe11_processing_uncontrolled_exceptions_in_a_group_of_threads;


public class Main {
    public static void main(String[] args) {
        MyThreadGroup threadGroup = new MyThreadGroup("MyThreadGroup");
        Task task = new Task();
        for (int i = 0; i < 2; i++) {
            Thread t = new Thread(threadGroup, task);
            t.start();
        }

    }
}
