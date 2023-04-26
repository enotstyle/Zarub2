package Lesson7.multithreading;

public class VolatileEx extends Thread {

    volatile boolean  b = true;

    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finished " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileEx t1 = new VolatileEx();
        t1.start();
        Thread.sleep(3000);
        System.out.println("After 3 sec its time to wake up");
        t1.b = false;
        t1.join();
        System.out.println("End of programm");

    }
}
