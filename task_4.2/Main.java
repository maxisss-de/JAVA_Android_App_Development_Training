// ------------------------------------------------------------------------
/*
Задача:
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
// ------------------------------------------------------------------------

public class Main {
    
    public static void main(String[] args) {
        Dog himalayasDog = new Dog("Гималай",35,7);
        Dog micropDog = new Dog("Микроп",60,3);
        Cat democratCat = new Cat("Демократ" ,12,25);
        Cat einsteinCat = new Cat("Эйнштейн" ,15,26);
        Cat chattererCat = new Cat("Говорун",10,24);
        Mouse schultzMouse = new Mouse("Шульц", 2, 4);
        Mouse al_caponeMouse = new Mouse("Аль Капоне", 2, 4);
        Mouse sueMouse = new Mouse("Сью", 1, 3);
        System.out.println("Кастинг на мультик Том и Джерри.");
        System.out.println("Претенденты на роли:");
        System.out.println("Привет! Меня зовут: "+himalayasDog.name+". Мой вес: "+himalayasDog.weight+" кг. Длина моего хвоста: "+himalayasDog.tail_size+" см.");
        System.out.println("Привет! Меня зовут: "+micropDog.name+". Мой вес: "+micropDog.weight+" кг. Длина моего хвоста: "+micropDog.tail_size+" см.");
        System.out.println("Привет! Меня зовут: "+democratCat.name+". Мой вес: "+democratCat.weight+" кг. Длина моего хвоста: "+democratCat.tail_size+" см.");
        System.out.println("Привет! Меня зовут: "+einsteinCat.name+". Мой вес: "+einsteinCat.weight+" кг. Длина моего хвоста: "+einsteinCat.tail_size+" см.");
        System.out.println("Привет! Меня зовут: "+chattererCat.name+". Мой вес: "+chattererCat.weight+" кг. Длина моего хвоста: "+chattererCat.tail_size+" см.");
        System.out.println("Привет! Меня зовут: "+schultzMouse.name+". Мой вес: "+schultzMouse.weight+" кг. Длина моего хвоста: "+schultzMouse.tail_size+" см.");
        System.out.println("Привет! Меня зовут: "+al_caponeMouse.name+". Мой вес: "+al_caponeMouse.weight+" кг. Длина моего хвоста: "+al_caponeMouse.tail_size+" см.");
        System.out.println("Привет! Меня зовут: "+sueMouse.name+". Мой вес: "+sueMouse.weight+" кг. Длина моего хвоста: "+sueMouse.tail_size+" см.");
    }
}

class Dog {
    
    String name;
    int weight;
    int tail_size;
    
    public Dog(String name, int weight, int tail_size) {
        this.name = name;
        this.weight = weight;
        this.tail_size = tail_size;
    }
}

class Cat {
    
    String name;
    int weight;
    int tail_size;
    
    public Cat(String name, int weight, int tail_size) {
        this.name = name;
        this.weight = weight;
        this.tail_size = tail_size;
    }
}

class Mouse {
    
    String name;
    int weight;
    int tail_size;
    
    public Mouse(String name, int weight, int tail_size) {
        this.name = name;
        this.weight = weight;
        this.tail_size = tail_size;
    }
}
