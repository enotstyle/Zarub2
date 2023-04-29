package Lesson7.multithreading;

import java.util.concurrent.*;

public class RunnableFactorial {
    static int factorialResult;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        executorService.execute(new Factorial(6));
        Future future = executorService.submit(new Factorial(6));
        executorService.shutdown();
        executorService.awaitTermination(100, TimeUnit.SECONDS);
        System.out.println(future.get());
        System.out.println(future.isDone());
        System.out.println(factorialResult);
    }
}


class Factorial implements Runnable {
    int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("вы ввели невреное число");
            return;
        } else {
            int result = 1;
            for (int i = 1; i <= f; i++) {
                result *= i;
            }
            RunnableFactorial.factorialResult = result;
        }
    }
}