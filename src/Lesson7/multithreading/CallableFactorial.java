package Lesson7.multithreading;

import java.util.concurrent.*;

public class CallableFactorial {
    static int faktorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Faktorial2 faktorial2 = new Faktorial2(6);
        Future<Integer> future = executorService.submit(faktorial2);
        try {
            System.out.println(future.isDone());
            System.out.println("хотим получить результат");
            faktorialResult = future.get();
            System.out.println("получили результат");
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            System.out.println(e.getCause());
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            executorService.shutdown();
        }
        System.out.println(faktorialResult);
    }
}

class Faktorial2 implements Callable<Integer> {
    int f;

    Faktorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("вы ввели неверное число");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(1000);
        }
        return result;
    }
}
