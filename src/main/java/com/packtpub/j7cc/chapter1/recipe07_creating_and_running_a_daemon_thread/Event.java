package com.packtpub.j7cc.chapter1.recipe07_creating_and_running_a_daemon_thread;


import java.util.Date;

public class Event {
    private Date date;
    private String event;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
