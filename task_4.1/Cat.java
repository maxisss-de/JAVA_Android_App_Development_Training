public class Cat {
    
    public int age;
    public int weight;
    public int strength;
    
    public Cat() {
    }
    
    public boolean fight(Cat otherCat) {
        int i=0;
        if (this.age>otherCat.age) i++;
            else if (this.age<otherCat.age) i--;
        if (this.weight>otherCat.weight) i++;
        else if (this.weight<otherCat.weight) i--;
        if (this.strength>otherCat.strength) i++;
            else if (this.strength<otherCat.strength) i--;
        if (i>0) return true;
            else if (i<0) return false;
        else {
            if (this.hashCode()<(otherCat.hashCode())) return false;
            if (this.hashCode()>=otherCat.hashCode()) return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cat1.age=8; cat1.weight=8; cat1.strength=90;
        cat2.age=7; cat2.weight=7; cat2.strength=70;
        cat3.age=6; cat3.weight=6; cat3.strength=60;
        System.out.println("Кот №1: возраст " +cat1.age+" лет. Вес кота №1: "+cat1.weight+" кг. Сила кота №1: "+cat1.strength);
        System.out.println("Кот №2: возраст " +cat2.age+" лет. Вес кота №2: "+cat2.weight+" кг. Сила кота №2: "+cat2.strength);
        System.out.println("Кот №3: возраст " +cat3.age+" лет. Вес кота №3: "+cat3.weight+" кг. Сила кота №3: "+cat3.strength);
        if (cat1.fight(cat2)) {System.out.println("В драки Кот №1 победил кота №2");}
            else System.out.println("В драки Кот №2 победил Кота №1");
        if (cat2.fight(cat1)) {System.out.println("В драки Кот №2 победил Кота №1");}
            else System.out.println("В драки Кот №1 победил Кота №2");
        if (cat2.fight(cat3)) {System.out.println("В драки Кот №2 победил Кота №3");}
            else System.out.println("В драки Кот №3 победил Кота №2");
        if (cat3.fight(cat2)) {System.out.println("В драки Кот №3 победил Кота №2");}
            else System.out.println("В драки Кот №2 победил Кота №3");
        if (cat3.fight(cat1)) {System.out.println("В драки Кот №3 победил Кота №1");}
            else System.out.println("В драки Кот №1 победил Кота №3");
    }
}
