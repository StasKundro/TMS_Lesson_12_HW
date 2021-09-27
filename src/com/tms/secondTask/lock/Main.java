package com.tms.secondTask.lock;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    LinkedList<Integer> numIn = new LinkedList<>();
    int sumOfNum = 0;

    public void put(ReentrantLock locker) {
        while (sumOfNum < 5) {
            locker.lock();
            try {
                int randomNumber = (int) (Math.random() * (101 - 1)) + 2;
                numIn.add(randomNumber);
                sumOfNum++;
                Thread.sleep(1000);
                System.out.println("Добавили число " + randomNumber + "; " + numIn);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                locker.unlock();
            }
        }
    }

    public void get(ReentrantLock locker) {
        while (sumOfNum > 0) {
            locker.lock();
            try {
                numIn.removeFirst();
                sumOfNum--;
                Thread.sleep(1000);
                System.out.println("Убрали число" + "; " + numIn);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                locker.unlock();
            }
        }
    }
}
