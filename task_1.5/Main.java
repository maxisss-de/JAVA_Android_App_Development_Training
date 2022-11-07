import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Введите значение температуры в градусах ТС = ");
        float tc = scanner.nextFloat();
        System.out.println ("Вы ввели "+tc+" градусов по ТС");
        float ft = (9*tc/5 + 32);
        System.out.println ("Вывод это " + ft + " градусов по Фаренгейту FT");
    }
}
