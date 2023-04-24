package Lesson7.Multithreading;

public class Ex6 implements Runnable{

    @Override
    public void run() {
        System.out.println("Method run. Thread name " + Thread.currentThread());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Ex6());
        t1.start();

        System.out.println("Main run. Thread name " + Thread.currentThread());
    }
}
