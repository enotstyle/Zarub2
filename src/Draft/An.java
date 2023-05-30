package Draft;

class Animal {
    public void makeSound() throws AnimalSoundException {
        // ...
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        // ...
    }
}

class Test228 {


    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
    }

}


class AnimalSoundException extends Exception{}

class CatSoundException extends AnimalSoundException{};