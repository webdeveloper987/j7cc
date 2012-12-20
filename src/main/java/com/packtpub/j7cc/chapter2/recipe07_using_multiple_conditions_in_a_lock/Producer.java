package com.packtpub.j7cc.chapter2.recipe07_using_multiple_conditions_in_a_lock;

public class Producer implements Runnable {

    private FileMock mock;
    private Buffer buffer;

    public Producer(FileMock mock, Buffer buffer) {
        this.mock = mock;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        buffer.setPendingLines(true);
        while (mock.hasMoreLines()){
            String line=mock.getLine();
            buffer.insert(line);
        }
        buffer.setPendingLines(false);
    }
}
