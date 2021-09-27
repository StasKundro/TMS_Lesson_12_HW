package com.tms.firstTask;

/**
 * Создать три потока Т1, Т2 и Т3
 * Реализовать выполнение поток в последовательности Т3 -> Т2 -> Т1
 * (используя метод join)
 */

public class Test {
    public static void main(String[] args) {

        FirstT t1 = new FirstT();
        SecondT t2 = new SecondT();
        ThirdT t3 = new ThirdT();

        Thread first = new Thread(t1);
        first.setName("FirstThread");
        Thread second = new Thread(t2);
        second.setName("SecondThread");
        Thread third = new Thread(t3);
        third.setName("ThirdThread");

        try {
            third.start();
            third.join();

            second.start();
            second.join();

            first.start();
            first.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
