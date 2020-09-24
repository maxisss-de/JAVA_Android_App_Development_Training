/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.
Требования:
•	Создай класс Dog.
•	Создай класс Cat.
•	В классе Dog должно быть три переменные.
•	В классе Cat должно быть три переменные.
•	Должен быть создан хотя бы один объект типа Mouse.
•	Должен быть создан хотя бы один объект типа Dog.
•	Должен быть создан хотя бы один объект типа Cat.
*/

public class Main {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Mouse tuffyMouse = new Mouse("Tuffy", 12, 5);
        Cat tomasCat   = new Cat("Tomas" ,53,100);
        Cat butchCat   = new Cat("Butch" ,78,0);
        Cat toodlesCat = new Cat("Toodles",60,15);
        Dog spikeDog = new Dog("Spike",67,200);
        Dog tykeDog  = new Dog("Tyke",17,20);
    }
}
//=================== Класс Mouse ( Мышь ) ===========================
class Mouse {
    String name;
    int height;
    int tail;

    public Mouse(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }
}
//=================== Класс Dog( Собака ) =============================
class Dog {
    String name;
    int height;
    int money;

    public Dog(String name, int height, int money) {
        this.name = name;
        this.height = height;
        this.money = money;
    }
}
//================+=== Класс Cat( Котэ ) =============================
class Cat {
    String name;
    int height;
    int money;

    public Cat(String name, int height, int money) {
        this.name = name;
        this.height = height;
        this.money = money;
    }
}
