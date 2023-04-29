package Lesson7.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPullEx2 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//        for (int i = 0; i<10; i++ ) {
//            scheduledExecutorService.execute(new RunnableImp200());
//        }
//        scheduledExecutorService.schedule(new RunnableImp200(), 3, TimeUnit.SECONDS);
//        scheduledExecutorService.scheduleAtFixedRate(new RunnableImp200(), 3, 1, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImp200(), 3, 1, TimeUnit.SECONDS);
        Thread.sleep(20000);
        scheduledExecutorService.shutdown();

        ExecutorService executorService = Executors.newCachedThreadPool();
    }
}


class RunnableImp200 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}