package com.packtpub.j7cc.chapter5.recipe05_cancelling_a_task;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinTask;

public class TaskManager {
    private List<ForkJoinTask<Integer>> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(ForkJoinTask<Integer> task) {
        tasks.add(task);
    }

    public void cancelTasks(ForkJoinTask<Integer> cancelTask) {
        for (ForkJoinTask<Integer> task : tasks) {
            if (task != cancelTask) {
                task.cancel(true);
                ((SearchNumberTask) task).writeCancelMessage();
            }
        }
    }
}
