package Lesson7.Multithreading;

public class Ex5 {

    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();

        myThread5.setName("мой поток");
        myThread5.setPriority(Thread.NORM_PRIORITY);
        System.out.println("имя потока " + myThread5.getName() + " приоритет " + myThread5.getPriority());
    }
}


class MyThread5 extends Thread {
    public void run() {
        System.out.println("privet");
    }
}