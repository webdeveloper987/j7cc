package com.packtpub.j7cc.chapter6.recipe06_generating_concurrent_random_numbers;

public class Main {
    public static void main(String[] args) {
        Thread threads[] = new Thread[3];
        for (int i = 0; i < 3; i++) {
            TaskLocalRandom task = new TaskLocalRandom();
            threads[i] = new Thread(task);
            threads[i].start();
        }
    }
}
