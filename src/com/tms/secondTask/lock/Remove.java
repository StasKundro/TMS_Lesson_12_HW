package com.tms.secondTask.lock;

import java.util.concurrent.locks.ReentrantLock;

public class Remove implements Runnable{
    private Main x;
    ReentrantLock locker;

    public Remove(Main x, ReentrantLock lock){
        this.x = x;
        locker = lock;
    }

    @Override
    public void run() {
        doInnerLogic(locker);
    }

    private void doInnerLogic(ReentrantLock locker) {
        while (true) {
            x.get(locker);
        }
    }
}
