package com.packtpub.j7cc.chapter4.recipe10_separating_the_launching_of_tasks_and_the_processing_of_thrir_results_in_an_executor;

import java.util.concurrent.CompletionService;

public class ReportRequest implements Runnable {
    private String name;
    private CompletionService<String> service;

    public ReportRequest(String name, CompletionService<String>
            service) {
        this.name = name;
        this.service = service;
    }

    @Override
    public void run() {
        ReportGenerator reportGenerator = new ReportGenerator(name,
                "Report");
        service.submit(reportGenerator);
    }
}
