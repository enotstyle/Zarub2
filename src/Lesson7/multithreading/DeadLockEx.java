package Lesson7.multithreading;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 t1 = new Thread10();
        Thread10 t2 = new Thread10();
        t1.start();
        t2.start();
    }
}


class Thread10 extends Thread {
    public void run() {
        System.out.println("Тред10 пытается захватить монитор объекта Лок1");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Тред10 захватил монитор объекта Лок1");
            System.out.println("Тред10 пытается захватить монитор объекта Лок2");
            synchronized (DeadLockEx.lock2) {
                System.out.println("Тред10 захватил монитор объекта Лок1 и Лок2");
            }

        }
    }
}

class Thread20 extends Thread {
    public void run() {
        System.out.println("Тред20 пытается захватить монитор объекта Лок2");
        synchronized (DeadLockEx.lock2) {
            System.out.println("Тред20 захватил монитор объекта Лок2");
            System.out.println("Тред20 пытается захватить монитор объекта Лок1");
            synchronized (DeadLockEx.lock1) {
                System.out.println("Тред20 захватил монитор объекта Лок1 и Лок1");
            }

        }
    }
}