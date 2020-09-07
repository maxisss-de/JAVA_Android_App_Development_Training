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

/* Ответ  */

import java.io.*;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> data = new ArrayList<>();
        File topcat = new File(new File(".").getCanonicalPath());
        String fromAtoZ;
        System.out.println("Укажите полный путь к файлу где содержатся целые числа на каждой строке");
        System.out.println("или название файла из директории "+ topcat.getCanonicalPath());
        String nametopcat = scanner.nextLine();
        if (nametopcat.indexOf(':')>0) fromAtoZ = nametopcat;
        else {
            System.out.println("Вы ввели " + nametopcat);
            fromAtoZ = topcat.getCanonicalPath() + (char) 92 + nametopcat;
        }
        System.out.println("Ищем файл по адресу " + fromAtoZ);
        FileInputStream finput = new FileInputStream(fromAtoZ);

        int k=-1;
        int csl = 0;
        String bufferInt="";
        do {
            k=finput.read();
            if ((k!=13)&(k!=10)&(k!=-1)) {
                bufferInt+=((char)k);
            }
            else if (bufferInt!=""){
                System.out.println("Число считано : " + bufferInt);
                csl = Integer.parseInt(bufferInt);
                data.add(csl);
                bufferInt="";
            }
        } while (k!=-1);

        System.out.println("Числа загружены :"+data);
        finput.close();
        System.out.println("Сортировка и поиск четных чисел");
        Collections.sort(data);
        System.out.println("Числа отсортированы по возростанию :"+data);
        int count2=0;
        for (int i=0; i<(data.size()); i++) {
            if ((data.get(i))%2==0) {
                System.out.println("Обнаружено чётное число:  " + data.get(i));
                count2++;
            }
        }
        if (count2==0) System.out.println("Чётные числа не обнаружены");
        System.out.println("Конец программы.");
    }
}
