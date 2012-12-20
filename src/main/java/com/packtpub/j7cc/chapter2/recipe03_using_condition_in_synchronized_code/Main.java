package com.packtpub.j7cc.chapter2.recipe03_using_condition_in_synchronized_code;


public class Main {
    public static void main(String[] args) {
        EventStorage storage = new EventStorage();
        Producer producer = new Producer(storage);
        Thread thread1 = new Thread(producer);
        Consumer consumer = new Consumer(storage);
        Thread thread2 = new Thread(consumer);
        thread2.start();
        thread1.start();

    }
}
