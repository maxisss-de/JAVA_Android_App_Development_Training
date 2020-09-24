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

//package Task_5_2;

import java.io.*;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> data = new ArrayList<>();  // data - массив для считываемых чисел из файла
        File tcatalog = new File(new File(".").getCanonicalPath());//(getAbsolutePath());
        String fullpath;
        //===================================== Запрашиваем адрес файла у пользователя ==================
        System.out.println("Укажите полный путь к файлу где содержатся целые числа на каждой строке");
        System.out.println("или укажите название файла из директории "+ tcatalog.getCanonicalPath());
        String namefile = scanner.nextLine();
        // - Если пользователь ввел полный путь к файлу определяем по наличию символа ":" в пути -
        if (namefile.indexOf(':')>0) fullpath = namefile;
        // - Если пользователь ввел только имя файла, то ищем его в директории которую возвращает метод getCanonicalPath()  -
        else {
            System.out.println("Вы ввели " + namefile);
            fullpath = tcatalog.getCanonicalPath() + (char) 92 + namefile;
        }
        // - Контрольное сообщение о том где програма, в итоге, собирается искать файл -
        System.out.println("Ищем файл по адресу   " + fullpath);
        FileInputStream finput = new FileInputStream(fullpath);

//================================= ЧИТАЕМ ПОЛУЧЕННЫЙ ОТ ПОЛЬЗОВАТЕЛЯ ФАЙЛ ПОСИМВОЛЬНО =====================
        int k=-1;   // - ascii номер считанного символа -
        int csl = 0; // - служебный буфер для добавления числа в коллекцию data -
        String bufferInt="";   // - строковый буфер для наполнения текущего числа новыми символами из файла -
        do { // ======= Читаем файл посимвольно пока не достигнем конца файла =======
            k=finput.read();
            // - Если считанный символ не равен концу строки, переносу строки или концу файла
            if ((k!=13)&(k!=10)&(k!=-1))/*(((char)k)!=((char)13))*/ {
                bufferInt+=((char)k); // - Прибавляем символ к текущей цифре -
                //System.out.print("Считан символ : " + (char) k);
            }
            // - Если считан спецсимвол 10 или 13 или конец строки и bufferInt не пустой, то добавляем получившееся число в коллецию data -
            else if (bufferInt!=""){
                System.out.println("Считано число : " + bufferInt); // - Контрольное сообщение на экран, о числе которое удалось считать в виде строки-
                csl = Integer.parseInt(bufferInt); // - Преобразуем счинанную строку в число -
                data.add(csl);  // - Добавляем число в коллекцию data -
                bufferInt="";   // - На всякий случай. Для профилактики. -
            }
        } while (k!=-1);  // - Конец цикла по достижению конца файла -

        System.out.println("Загружены числа :"+data);  // - Выводим на экран что в итоге считали в коллекцию data -
        finput.close(); // - Закрываем файл -

// ===================================  СОРТИРУЕМ ПОЛУЧЕННЫЕ ЧИСЛА И ИЩЕМ ЧЕТНЫЕ ===========================================
        System.out.println("============ Переходим к сортировке и поиску четных чисел ==================");
        Collections.sort(data); // - Вот и вся сортировка .... -
        System.out.println("Числа отсортированы по возростанию :"+data);
        //========================  Вывод только чётных чисел =============================
        int count2=0;
        for (int i=0; i<(data.size()); i++) {
            if ((data.get(i))%2==0) {
                System.out.println("Обнаружено чётное число:  " + data.get(i));
                // else System.out.println("Нечетное число:  "+data.get(i));
                count2++;
            }
        }
        if (count2==0) System.out.println("Четные числа в файле не обнаружены");
        // System.out.println();
        System.out.println("========== Работа программы окончена. Успехов в изучении Java! =============");
    }
}
