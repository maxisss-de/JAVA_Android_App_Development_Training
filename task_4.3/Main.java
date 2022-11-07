// ------------------------------------------------------------------------
/*
Задача:
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/
// ------------------------------------------------------------------------

public class Main {
    
    public static void main(String[] args) {
        Horse agate = new Horse("Агат", "Англо-норманн", 200, 210, 60);
        agate.run();
        Pegasus stitch = new Pegasus("Стич", "Беркут",50,45,120);
        stitch.fly();
    }
}

abstract class Animal {
    String name;
    String breed;
    int height;
    int weight;
    int speed;
    
    public Animal(String name, String breed, int height, int weight, int speed) {
        this.name = name;
        this.breed = breed;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }
}

class Horse extends Animal {
    
    public Horse(String name, String breed, int height, int weight, int speed) {
        super(name, breed, height, weight, speed);
    }
    
    public void run() {
        System.out.println("Игого, я поскакал(а)");
    }
}

class Pegasus extends Horse {
    
    public Pegasus(String name, String breed, int height, int weight, int speed) {
        super(name, breed, height, weight, speed);
    }
    
    public void fly() {
        System.out.println("Игого, я полетел(а)");
    }
}
