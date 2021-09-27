package com.tms.thirdTask;

import com.tms.thirdTask.synchronize.Ad;
import com.tms.thirdTask.synchronize.Main;
import com.tms.thirdTask.synchronize.Remove;

/**
 * Напишите многопоточный ограниченный буфер с использованием synchronized.
 */

public class Test {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------");
        Main x = new Main();
        Ad ad = new Ad(x);
        Remove remove = new Remove(x);
        new Thread(ad).start();
        new Thread(remove).start();
    }
}
