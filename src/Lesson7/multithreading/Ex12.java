package Lesson7.multithreading;

public class Ex12 {
    private static final Object lock = new Object();

    void mobileCall() {
        synchronized (lock) {
            System.out.println(this);
            System.out.println("mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("mobile call ends");
        }
    }

    synchronized void skypeCall() {
        synchronized (lock) {
            System.out.println(this);
            System.out.println("skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("skype call ends");
        }
    }

    synchronized void whatsappCall() {
        synchronized (lock) {
            System.out.println(this);
            System.out.println("whatsapp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("whatsapp call ends");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableImpMobile());
        Thread t2 = new Thread(new RunnableImpSkype());
        Thread t3 = new Thread(new RunnableImpWhatsapp());
        t1.start();
        t2.start();
        t3.start();
    }

}

class RunnableImpMobile implements Runnable {
    @Override
    public void run() {
        new Ex12().mobileCall();
    }
}

class RunnableImpSkype implements Runnable {
    @Override
    public void run() {
        new Ex12().skypeCall();
    }
}

class RunnableImpWhatsapp implements Runnable {
    @Override
    public void run() {
        new Ex12().whatsappCall();
    }
}



