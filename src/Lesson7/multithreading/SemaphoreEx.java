package Lesson7.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Ivan", callBox);
        new Person("oleg", callBox);
        new Person("elena", callBox);
        new Person("vlad", callBox);
        new Person("marina", callBox);
    }
}


class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    public void run() {
        try {
            System.out.println(name + " ждет");
            callBox.acquire();
            System.out.println(name + " разговаривает по телефону");
            sleep(2000);
            System.out.println(name + " завершил звонок");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            callBox.release();
        }
    }
}