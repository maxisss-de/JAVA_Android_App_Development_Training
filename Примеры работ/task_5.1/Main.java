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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) throws IOException {
        // ==== Объявили переменную reader типа класса BufferedReader для чтения данных с консоли ===
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // === Объявили переменные name и city типа ArrayList<> состоящие из объектов String
        List<String> name = new ArrayList<>(); // Список имен
        List<String> city = new ArrayList<>(); // Список фамилий

        //=========================НАЧАЛЬНЫЕ ИНСТРУКЦИИ ДЛЯ ПОЛЬЗОВАТЕЛЯ НА ЭКРАНЕ: ==============================
        System.out.println("Введите города и фамилии проживающих в них семей. ");
        System.out.println("По формату: Город, Энтер, Фамилия, Энтер.  ");
        System.out.println("(по окончанию ввода нажмите еще один раз Энтер и перейдёте к поиску Семей по названиям городов)");
        // =================== Читаем текст с консоли до ввода пустой строки =================================
        while (true) {
            // Читаем значение города
            String gorod = reader.readLine();
            if (gorod.isEmpty()) {
                break; // если введена пустая строка, то закончить цикл
            }

            String family = reader.readLine();
            if (family.isEmpty()) {
                break; // если введена пустая строка, то закончить цикл
            }
            city.add(gorod);    // Добавляем город в список городов
            name.add(family);   // Добавляем фамилию в список фамилий
        }
        System.out.println("Вы ввели Name(Фамилии): "+ name );
        System.out.println("Вы ввели City(Города): "+ city );

// ===================== переходим к поиску семей живущих в требуемом городе =============================
        String cityfind="000"; // ==== искомый город ================
        // =================== Запрашиваем в каком городе искать ====
        System.out.println("Выберите город из списка выше для поиска семей живущих в нем : ");

        while (true) {  // == Цикл поиска по городам до посинения ====
            cityfind = reader.readLine();
            System.out.println("Вы ищите тех кто живет в городе : " + cityfind);
            // ====   Если запрашиваемый город в списке отсутствует ====
            if (city.lastIndexOf(cityfind) == -1) System.out.println("Нет такого города в списке ");
            // =====   Если запрашиваемый город в списке присутствует ====
            if (city.lastIndexOf(cityfind) >= 0) { // если такой город в списке есть
                System.out.println("Город в списке : " + (1 + city.lastIndexOf(cityfind)));
                // ==== Выводим фамилию проживающей в городе семьи ====
                String findFamily = name.get(city.lastIndexOf(cityfind));
                System.out.println("В городе " + cityfind + " живет семья : " + findFamily);
            }

            System.out.println("Введите название следующего города для продолжения поиска ");
        }
    }
}//============================ КОНЕЦ ПРОГРАММЫ ============================================================
