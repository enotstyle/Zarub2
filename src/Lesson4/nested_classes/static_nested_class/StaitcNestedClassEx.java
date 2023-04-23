package Lesson4.nested_classes.static_nested_class;

class Car1 {
    private static int countCars = 0;
    String color;
    Engine engine;

    Car1(String color, Engine engine) {
        this.color = color;
        this.engine = engine;
        countCars++;
        System.out.println("Число созданных машин: " + countCars);
        System.out.println("Число созданных двигателей: " + Engine.countEngines);
    }

    static class Engine {
        int horsePower;
        private static int countEngines = 0;

        Engine(int horsePower) {
            this.horsePower = horsePower;
            countEngines ++;
            System.out.println("Число созданных машин: " + countCars);
            System.out.println("Число созданных двигателей: " + countEngines);
        }

        @Override
        public String toString() {
            return "My Engine with horsePower = {" +
                    horsePower +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "My Lesson4.nested_classes.static_nested_class.Car with color = {" +
                color +
                '}';
    }
}

class Test1 {
    public static void main(String[] args) {
        Car1.Engine engine = new Car1.Engine(200);
        System.out.println(engine);
        Car1 car = new Car1("black", engine);
        Car1.Engine engine2 = new Car1.Engine(300);
    }
}