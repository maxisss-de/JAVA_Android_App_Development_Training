import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Размеры бассейна в метрах");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int v = a*b*c*1000;
        System.out.print("Длина = ");
        System.out.print("Ширина = ");
        System.out.print("Высота = ");
        System.out.print("Всего "+ v +" литров в бассейне");
    }
}
