package com.tms.secondTask;

import com.tms.secondTask.lock.Ad;
import com.tms.secondTask.lock.Main;
import com.tms.secondTask.lock.Remove;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Напишите многопоточный ограниченный буфер с использованием ReentrantLock.
 */

public class Test {
    public static void main(String[] args) {
        Main x = new Main();
        ReentrantLock locker = new ReentrantLock();
        Ad ad = new Ad(x, locker);
        Remove remove = new Remove(x, locker);
        new Thread(ad).start();
        new Thread(remove).start();
    }
}
