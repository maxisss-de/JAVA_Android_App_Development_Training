/* 
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/

/* Делаю  */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Введите значение");
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int g = scanner.nextInt();
        int h = scanner.nextInt();
        int i = scanner.nextInt();
        System.out.println ("Вы ввели "+b+c+d+e+f+g+h+i+" значение");
        int a = ;
        if((a%2)==0){
                System.out.println("Число "+b+c+d+e+f+g+h+i+" четное ");
            }
        else{
            if((a%1)==0){
                System.out.println("Число "+b+c+d+e+f+g+h+i+" нечетное ");
            }
        }
    }
}
