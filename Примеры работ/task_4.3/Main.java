/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/

public class Main{
    public static void main(String[] args) {

        Horse gasmin = new Horse("Жасмин",250,210,4);
        gasmin.run();// - Лошадь Жасмин поскакала

        Pegasus agat = new Pegasus("Агат",350,270,5);
        agat.fly();  // - Пегас Агат полетел
    }
}

//=========================== Класс Animal(Животное) - Общий абстрактный класс для животных =============

abstract class Animal {
    String name;// Имя животного
    int weight; // Вес, в кг.
    int height; // Рост, в см.
    int color;  // Цвет

    public Animal(String name, int weight, int height, int color) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.color = color;
    }
}

//====================+======= Класс Horse (Лошадь обычная) =============================================

class Horse extends Animal {

    public Horse(String name, int weight, int height, int color) {
        super(name, weight, height, color);
    }

    public void run() { System.out.println("Игого, я поскакал(а)"); }
}

//============================ Класс Pegasus (Лошадь необычная, с крыльями, летающая) ===================

class Pegasus extends Horse {

    public Pegasus(String name, int weight, int height, int color) {
        super(name, weight, height, color);
    }

    public void fly() { System.out.println("Игого, я полетел(а)");}
}

//============================ КОНЕЦ ПРОГРАММЫ ===========================================================
