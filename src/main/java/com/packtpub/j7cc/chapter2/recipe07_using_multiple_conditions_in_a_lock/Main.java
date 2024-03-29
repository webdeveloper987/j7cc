package com.packtpub.j7cc.chapter2.recipe07_using_multiple_conditions_in_a_lock;

public class Main {

    public static final int CONCUMER_COUNT = 3;

    public static void main(String[] args) {
        FileMock mock = new FileMock(100, 10);
        Buffer buffer = new Buffer(20);
        Producer producer = new Producer(mock, buffer);
        Thread threadProducer = new Thread(producer, "Producer");
        Consumer consumers[] = new Consumer[CONCUMER_COUNT];
        Thread threadConsumers[] = new Thread[CONCUMER_COUNT];
        for (int i = 0; i < CONCUMER_COUNT; i++) {
            consumers[i] = new Consumer(buffer);
            threadConsumers[i] = new Thread(consumers[i], "Consumer " + i);
        }
        threadProducer.start();
        for (int i = 0; i < CONCUMER_COUNT; i++) {
            threadConsumers[i].start();
        }
    }
}