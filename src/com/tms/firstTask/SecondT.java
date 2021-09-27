package com.tms.firstTask;

public class SecondT implements Runnable {

    @Override
    public void run() {
        secondLogic();
    }

    private void secondLogic() {
        String currentThread = Thread.currentThread().getName();
        for (int i = 1; i < 6; i++) {
            System.out.println(currentThread + " - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(currentThread + " - done");
    }
}
