package Lesson5.lambda;

import java.util.function.Consumer;

public class Test5 {
    static void printCars(Car car, Consumer<Car> consumer) {
        consumer.accept(car);
    }

    public static void main(String[] args) {
        Car car1 = new Car("bmw", "red", 12);
        printCars(car1, (car -> System.out.println(car)));
    }
}
