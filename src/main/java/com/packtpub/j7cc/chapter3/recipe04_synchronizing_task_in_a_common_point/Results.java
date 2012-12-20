package com.packtpub.j7cc.chapter3.recipe04_synchronizing_task_in_a_common_point;

public class Results {
    private int data[];

    public Results(int size) {
        data = new int[size];
    }

    public void setData(int position, int value) {
        data[position] = value;
    }

    public int[] getData() {
        return data;
    }
}

