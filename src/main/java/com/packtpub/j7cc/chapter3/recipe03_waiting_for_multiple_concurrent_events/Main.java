package com.packtpub.j7cc.chapter3.recipe03_waiting_for_multiple_concurrent_events;

public class Main {

    public static final int PARTICIPANTS_COUNT = 10;

    public static void main(String[] args) throws InterruptedException {
        Videoconference conference = new Videoconference(PARTICIPANTS_COUNT);
        Thread threadConference = new Thread(conference);
        threadConference.start();
        for (int i = 0; i < PARTICIPANTS_COUNT; i++) {
            Participant p = new Participant(conference, "Participant " + i);
            Thread t = new Thread(p);
            t.start();
        }
    }
}