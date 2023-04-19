package Lesson4.nested_classes.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method() {
        System.out.println(Engine.countOfObjects);
        Engine e = new Engine(12);
        System.out.println(e.horsePower);
    }

    interface I{}

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine extends Z {
        private int horsePower;
        static int countOfObjects;
        public Engine(int horsePower) {
            this.horsePower = horsePower;
            countOfObjects++;
            System.out.println(a);
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(2);
        System.out.println(engine);
        Car car = new Car("Red", 2, engine);
        System.out.println(car);
        System.out.println(car.engine.some);
    }
}

class Z{
    int some = 2;
}

class Y extends Car.Engine {
    public Y(int horsePower) {
        super(horsePower);
    }
}