package Lesson7.multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    static CountDownLatch countDownLatchEx = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("персона магазина пришли на работу");
        countDownLatchEx.countDown();
        System.out.println("CountDownLatch = " + countDownLatchEx.getCount());
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Все готов к приему покупателей");
        countDownLatchEx.countDown();
        System.out.println("CountDownLatch = " + countDownLatchEx.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("магазин открыт");
        countDownLatchEx.countDown();
        System.out.println("CountDownLatch = " + countDownLatchEx.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Zaur", countDownLatchEx);
        new Friend("oleg", countDownLatchEx);
        new Friend("vika", countDownLatchEx);
        new Friend("marina", countDownLatchEx);
        new Friend("ivan", countDownLatchEx);
        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();
    }
}

class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;


    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    public void run() {
        try {
            countDownLatch.await();
            System.out.println("друг приступил к покупкам");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
