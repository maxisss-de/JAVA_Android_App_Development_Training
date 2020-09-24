/* Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false.
Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
*/


public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {  }

    public boolean fight(Cat anotherCat) {
        int i=0; // i - Фактор победы. Чем больше i - тем больше шансов на победу. //
        if (this.age      > anotherCat.age     ) i++; else if (this.age  < anotherCat.age ) i--;
        if (this.strength > anotherCat.strength) i++; else if (this.strength < anotherCat.strength) i--;
        if (this.weight   > anotherCat.weight ) i++; else if (this.weight   < anotherCat.weight ) i--;
        if (i>0) return true;
        else if (i<0) return false;
        else {
            if (this.hashCode() >= (anotherCat.hashCode()))  return true;
            if (this.hashCode() <  (anotherCat.hashCode()))  return false;
        }
        return false;
    }

    public static void main(String[] args) {
        /*/
        /=======================ПРОВЕРКА===============================
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cat1.age=20; cat1.weight=8; cat1.strength=200;
        cat2.age=20; cat2.weight=4; cat2.strength=500;
        cat3.age=20; cat3.weight=4; cat3.strength=500;
        System.out.println("Кот 1: Возраст " +cat1.age+" /  Вес "+cat1.weight+" /  Сила "+cat1.strength);
        System.out.println("Кот 2: Возраст " +cat2.age+" /  Вес "+cat2.weight+" /  Сила "+cat2.strength);
        System.out.println("Кот 3: Возраст " +cat3.age+" /  Вес "+cat3.weight+" /  Сила "+cat3.strength);
        if (cat1.fight(cat2)) {System.out.println("Кот 1 победил Кота 2");}  else System.out.println("Кот 2 победил Кота 1");
        if (cat2.fight(cat1)) {System.out.println("Кот 2 победил Кота 1");}  else System.out.println("Кот 1 победил Кота 2");
        if (cat2.fight(cat3)) {System.out.println("Кот 2 победил Кота 3");}  else System.out.println("Кот 3 победил Кота 2");
        if (cat3.fight(cat2)) {System.out.println("Кот 3 победил Кота 2");}  else System.out.println("Кот 2 победил Кота 3");
        //=======================КОНЕЦ ПРОВЕРКИ=========================
        */
    }
}
