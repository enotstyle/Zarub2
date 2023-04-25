package Lesson7.Multithreading;

public class Ex3 extends Thread {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("Privet");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MeThread3());
        Thread thread2 = new Thread(new MeThread4());
        Ex3 thread3 = new Ex3();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("da-da");
            };
        };
        Thread thread4 = new Thread(r1);
        Runnable r2 = () -> System.out.println("net-net");
        Thread thread5 = new Thread(r2);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();





        for (int i = 1; i <= 1000; i++) {
            System.out.println("Poka");
        }

    }
}


class MeThread3 implements Runnable {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class MeThread4 implements Runnable {
    public void run() {
        for (int i = 1000; i >= 1000; i--) {
            System.out.println(i);
        }
    }


}