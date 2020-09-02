/*
Перед решением прочтите https://www.codeflow.site/ru/article/java-buffered-reader
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */

/* Ещё делаю её, пока не проверяйте */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Создали объект reader класса BufferedReader
        List<String> list = new ArrayList<>(); // Создали коллекцию list с элементами типа строка
        while (true) {
            String family = reader.readLine(); // Cоздали строковую переменную family и приняли значение family через метод объекта reader класса BufferedReader
            if (family.isEmpty()) {
                break;
            }
            list.add(family); // Положили в коллекцию list (2) значение переменной family, принятое в (3) через метод объекта reader, созданного в (1).
        }
        String city = reader.readLine();
        for (int i=0; i<list.size(); i++) {
            if (list.get(i).equals(city)) {
                String surname = list.get(i+1);
                System.out.println(surname);
                break;
            }
            else if (i==list.size()-1)
                System.out.println("Поиск не дал результатов");
        }
    }
}
