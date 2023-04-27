package Draft;

import java.util.Arrays;

public class Ex {
    public static void main(String[] args) {
        a1.abc1();

    }
}


class a1 {
    static void abc1() {
        System.out.println("Я стэктрейс потока майн " + Arrays.toString(Thread.currentThread().getStackTrace()));
        System.out.println("Я стэктрейс эксепшена " + Arrays.toString(new Exception().getStackTrace()));
        abc2();
    }

    static void abc2() {
        System.out.println("Я стэктрейс потока майн " + Arrays.toString(Thread.currentThread().getStackTrace()));
        System.out.println("Я стэктрейс эксепшена " + Arrays.toString(new Exception().getStackTrace()));
    }
}


