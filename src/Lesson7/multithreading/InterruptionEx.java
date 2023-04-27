package Lesson7.multithreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterruptionThread thread = new InterruptionThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
        thread.join();
        System.out.println("Main ends");
    }
}


class InterruptionThread extends Thread {
    double sqrtSome = 0;

    public void run() {

        for (int i = 1; i <= 1000000000; i++) {
            if (this.isInterrupted()) {
                System.out.println("поток хотят прервать");
                System.out.println("убедились что состояние всех объектов нормально и звершили поток");
                System.out.println(sqrtSome);
                return;
            }
            sqrtSome += Math.sqrt(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("поток хотят прервать во время сна, давайте завершим его работу");
                System.out.println(sqrtSome);
                return;
            }
        }
        System.out.println(sqrtSome);
    }
}
