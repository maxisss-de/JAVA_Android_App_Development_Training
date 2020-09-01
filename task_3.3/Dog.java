/*
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
Требования:
•	Программа не должна считывать данные с клавиатуры.
•	У класса Dog должна быть переменная name с типом String.
•	У класса Dog должна быть переменная age с типом int.
•	У класса должен быть сеттер для переменной name.
•	У класса должен быть геттер для переменной name.
•	У класса должен быть сеттер для переменной age.
•	У класса должен быть геттер для переменной age.
*/

/* Ещё делаю */

class Dog {
    public static void main(String[] args) {
        Dog2 bolder = new Dog2 ("Болдер","15");
        bolder.setInfoAboutDog();
    }
}
class Dog2 {
    private String name;
    private int age;

    public Dog2 (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){return this.name;}
    public void setName(String name){
        this.name = name;
    }

    public String getAge(){return this.age;}
    public void setAge (String age){
        this.age = age;
    }


    void setInfoAboutDog(); {
        System.out.println ("Собаку зовут "+name+" ей "+age+" лет.");
    }

}
