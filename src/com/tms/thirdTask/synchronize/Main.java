package com.tms.thirdTask.synchronize;

public class Main {
    private String product = null;
    private boolean flag = true;

    public synchronized void put(){
        if (! flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        putIn();
        this.notify();
        this.flag = false;
    }

    public synchronized void get() {
        if (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        getFrom();
        this.notifyAll();
        this.flag = true;
    }

    private void putIn() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        product = "Спутник лайт";
        System.out.println("На точку доставлена вакцина : " + product);
        System.out.println("--------------------------------------------------------");
    }

    private void getFrom() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Клиент использовал : " + product);
        System.out.println(":::");
        System.out.println("На точке больше нет : " + product);
        System.out.println("--------------------------------------------------------");
        product = null;
    }
}
