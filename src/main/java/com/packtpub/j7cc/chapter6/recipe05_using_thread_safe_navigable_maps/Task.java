package com.packtpub.j7cc.chapter6.recipe05_using_thread_safe_navigable_maps;

import java.util.concurrent.ConcurrentSkipListMap;

public class Task implements Runnable {
    private ConcurrentSkipListMap<String, Contact> map;
    private String id;

    public Task(ConcurrentSkipListMap<String, Contact> map, String
            id) {
        this.id = id;
        this.map = map;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Contact contact = new Contact(id, String.valueOf(i + 1000));
            map.put(id + contact.getPhone(), contact);
        }
    }
}

