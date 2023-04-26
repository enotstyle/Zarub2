package Lesson7.multithreading;

public class Ex2 {
    public static void main(String[] args) {
        MeThread1 meThread1 = new MeThread1();
        MeThread2 meThread2 = new MeThread2();
        meThread1.start();
        meThread2.start();
    }
}


class MeThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class MeThread2 extends Thread {
    public void run() {
        for (int i = 1000; i >= 1000; i--) {
            System.out.println(i);
        }
    }


}
