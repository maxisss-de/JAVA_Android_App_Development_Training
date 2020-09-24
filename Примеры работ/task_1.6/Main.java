/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Уважаемый торварисчь пользователь, введите число! = ");
        double chislo = scanner.nextDouble();
        double bonus = chislo+ chislo*0.15;
        System.out.println("Ваше число, увеличенное на 15% будет равно "+bonus);
    }
}
