package Lesson4.nested_classes.inner_class;

class Car1 {
    private static int countCars = 0;
    private String color;
    Engine engine;

    Car1(String color) {
        this.color = color;
        countCars++;
        System.out.println("Число созданных машин: " + countCars);
        System.out.println("Число созданных двигателей: " + Engine.countEngines);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    class Engine {
        private int horsePower;
        private static int countEngines = 0;

        Engine(int horsePower) {
            this.horsePower = horsePower;
            countEngines++;
            System.out.println("Число созданных машин: " + countCars);
            System.out.println("Число созданных двигателей: " + countEngines);
        }

        @Override
        public String toString() {
            return "My Engine with horsePower = {" +
                    horsePower +
                    '}';
        }

        public void printCar() {
            System.out.println(Car1.this);
        }

        public void printEngine() {
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        return "My Car with color = {" +
                color + "} " + engine;
    }
}

class Test1 {
    public static void main(String[] args) {
        Car1 car = new Car1("red");
        Car1.Engine engine = car.new Engine(12);
        car.setEngine(engine);
        engine.printEngine();
        engine.printCar();
        car.engine.printCar();
        car.engine.printEngine();
    }
}