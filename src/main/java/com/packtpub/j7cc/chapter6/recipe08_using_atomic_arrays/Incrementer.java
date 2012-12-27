package com.packtpub.j7cc.chapter6.recipe08_using_atomic_arrays;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class Incrementer implements Runnable {
    private AtomicIntegerArray vector;

    public Incrementer(AtomicIntegerArray vector) {
        this.vector = vector;
    }

    @Override
    public void run() {
        for (int i = 0; i < vector.length(); i++) {
            vector.getAndIncrement(i);
        }
    }
}
