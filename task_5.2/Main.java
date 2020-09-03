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

import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("C:/Program Files/java/test.txt");
        int c;
        String document = "";
        while ((c=reader.read())!=-1){
            document += (char)c;
        }
        System.out.println("Вы выбрали числа:");
        System.out.println(document);
        
        int i = Integer.parseInt(document.trim());


        if((i%2)==0){
            System.out.println("Числа "+i+" чётные ");
        }
    }
}





// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print ("Введите значение");
//         int b = scanner.nextInt();
//         int c = scanner.nextInt();
//         int d = scanner.nextInt();
//         int e = scanner.nextInt();
//         int f = scanner.nextInt();
//         int g = scanner.nextInt();
//         int h = scanner.nextInt();
//         int i = scanner.nextInt();
//         System.out.println ("Вы ввели "+b+c+d+e+f+g+h+i+" значение");
//         int a = ; /* Подумать....  */
//         if((a%2)==0){
//                 System.out.println("Число "+b+c+d+e+f+g+h+i+" четное ");
//             }
//         else{
//             if((a%1)==0){
//                 System.out.println("Число "+b+c+d+e+f+g+h+i+" нечетное ");
//             }
//         }
//     }
// }
