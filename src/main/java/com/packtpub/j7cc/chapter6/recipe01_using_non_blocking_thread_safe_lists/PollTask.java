package com.packtpub.j7cc.chapter6.recipe01_using_non_blocking_thread_safe_lists;

import java.util.concurrent.ConcurrentLinkedDeque;

public class PollTask implements Runnable {
    private ConcurrentLinkedDeque<String> list;

    public PollTask(ConcurrentLinkedDeque<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            list.pollFirst();
            list.pollLast();
        }
    }
}
