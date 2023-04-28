package Lesson7.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEx {
    public static void main(String[] args) {
        Call call = new Call();
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                call.mobileCall();
            }
        });
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                call.skypeCall();
            }
        });
        Thread t3 = new Thread(new Runnable(){
            @Override
            public void run() {
                call.whatsappCall();
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}

class Call {
    private Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("mobile call starts");
            Thread.sleep(3000);
            System.out.println("mobile call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    void skypeCall() {
        lock.lock();
        try {
            System.out.println("skype call starts");
            Thread.sleep(7000);
            System.out.println("skype call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    void whatsappCall() {
        lock.lock();
        try {
            System.out.println("whatsapp call starts");
            Thread.sleep(7000);
            System.out.println("whatsapp call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}
