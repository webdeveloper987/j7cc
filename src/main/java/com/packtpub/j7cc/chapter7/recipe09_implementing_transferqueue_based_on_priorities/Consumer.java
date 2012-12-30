package com.packtpub.j7cc.chapter7.recipe09_implementing_transferqueue_based_on_priorities;

public class Consumer implements Runnable {
    private MyPriorityTransferQueue<Event> buffer;

    public Consumer(MyPriorityTransferQueue<Event> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1002; i++) {
            try {
                Event value = buffer.take();
                System.out.printf("Consumer: %s: %d\n", value.
                        getThread(), value.getPriority());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}