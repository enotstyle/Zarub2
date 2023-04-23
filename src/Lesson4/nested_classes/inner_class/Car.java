package Lesson4.nested_classes.inner_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }


    public class Engine {
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            System.out.println(doorCount);
        }

        @Override
        public String toString() {
            return "My Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}


class Test {
    public static void main(String[] args) {

        Car car = new Car("black", 4);
        System.out.println(car);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(car.engine);

        Car.Engine engine2 = new Car("black", 4).new Engine(200);
    }
}



