// ------------------------------------------------------------------------
/*
Задача:
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/
// ------------------------------------------------------------------------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение = ");
        double a = scanner.nextDouble();
        double cashback = a+ a*0.15;
        System.out.println("Вы получили "+cashback);
    }
}
