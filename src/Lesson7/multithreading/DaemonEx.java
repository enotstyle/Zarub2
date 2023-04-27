package Lesson7.multithreading;

public class DaemonEx {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("user_thread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemon_thread");
        daemonThread.setDaemon(true);
        daemonThread.start();
        userThread.start();
        System.out.println("Main thread ends");
    }
}


class UserThread extends Thread {
    public void run() {

        System.out.println(Thread.currentThread().getName() + " is Daemon " + Thread.currentThread().isDaemon());
        for (char i = 'a'; i < 'j'; i++) {
            try {
                Thread.sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

class DaemonThread extends Thread {
    public void run() {

        System.out.println(Thread.currentThread().getName() + " is Daemon " + Thread.currentThread().isDaemon());
        for (int i = 1; i < 1000; i++) {
            try {
                Thread.sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}