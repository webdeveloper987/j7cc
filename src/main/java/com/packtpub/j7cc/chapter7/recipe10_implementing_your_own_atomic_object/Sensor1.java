package com.packtpub.j7cc.chapter7.recipe10_implementing_your_own_atomic_object;

public class Sensor1 implements Runnable {
    private ParkingCounter counter;

    public Sensor1(ParkingCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.carIn();
        counter.carIn();
        counter.carIn();
        counter.carIn();
        counter.carOut();
        counter.carOut();
        counter.carOut();
        counter.carIn();
        counter.carIn();
        counter.carIn();
    }
}