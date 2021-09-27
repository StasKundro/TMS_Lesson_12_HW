package com.tms.firstTask;

public class ThirdT implements Runnable {

    @Override
    public void run() {
        thirdLogic();
    }

    private void thirdLogic() {
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
