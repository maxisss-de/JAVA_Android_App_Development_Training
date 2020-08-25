/*
Вывести на экран сумму чисел от 1 до 5 построчно (должно быть 5 строк):
1
1+2=3
1+2+3=6
...
Пример вывода:
1
3
6
...
Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 5 строк.
•	Число в каждой новой строке должно быть больше предыдущего.
•	Выводимый текст должен соответствовать заданию.*/

/* Ответ */


public class Main {
    public static void main(String[] args) {
       int a,b,c,d,e;
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        e = 5;
        System.out.println(a);
        System.out.println(a+b);
        System.out.println(a+b+c);
        System.out.println(a+b+c+d);
        System.out.println(a+b+c+d+e);

    }
}


/* или так: ответ 2 */

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int number = 1; number <= 5; number++) {
            sum += number;
            System.out.println(sum);
        }
    }
}
