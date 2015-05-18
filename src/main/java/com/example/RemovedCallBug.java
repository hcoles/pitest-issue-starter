package com.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RemovedCallBug {
    private final ExecutorService executorService = Executors.newFixedThreadPool(1);

    boolean doSomething() throws InterruptedException {
        return executorService != null;
    }
}
