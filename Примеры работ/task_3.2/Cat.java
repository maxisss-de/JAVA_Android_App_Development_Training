/*
Помогите коту обрести имя с помощью метода setName.
Требования:
•	Класс Cat должен содержать только одну переменную name.
•	Переменная name должна иметь модификатор доступа private и тип String.
•	Класс Cat должен содержать только два метода setName и main.
•	Метод setName класса Cat должен устанавливать значение переменной private String name равным переданному параметру String name.
*/
public class Cat {
    private String name = "безымянный кот";

    public void setName(String name) {
        this.name=name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}
