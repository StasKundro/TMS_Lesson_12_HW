package com.tms.secondTask.lock;

import java.util.concurrent.locks.ReentrantLock;

public class Ad implements Runnable {
    private Main x;
    ReentrantLock locker;

    public Ad(Main x, ReentrantLock lock){
        this.x = x;
        locker = lock;
    }

    @Override
    public void run() {
        doInnerLogic(locker);
    }

    private void doInnerLogic(ReentrantLock locker) {
        while (true) {
            x.put(locker);
        }
    }
}
