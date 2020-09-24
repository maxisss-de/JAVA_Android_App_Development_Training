/*Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
        Пример вывода на экран:
        8
        88
        888
        8888
        88888
        888888
        8888888
        88888888
        888888888
        8888888888
        */

// Делаем вывод в ОДИН цикл  FOR : 

public class Main {
    public static void main(String[] args) {
        String a10 = "8888888888";
        char[] kurzA10= new char[10];
        for (int i = 1; i<=10;i++) {
            a10.getChars(0, i, kurzA10, 0);
            System.out.println(kurzA10); // world
        }
    }
}
