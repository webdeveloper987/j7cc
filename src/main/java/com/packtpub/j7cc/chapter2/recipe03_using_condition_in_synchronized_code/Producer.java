package com.packtpub.j7cc.chapter2.recipe03_using_condition_in_synchronized_code;


public class Producer implements Runnable {

    private EventStorage storage;

    public Producer(EventStorage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i=0; i<100; i++){
            storage.set();
        }

    }
}
