/* Программа запрашивает у пользователя значение в градусах Цельсия. Программа должена переводить температуру и выводить на экран
значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TF = (9 / 5) * TC + 32
Пример:
на вход подается значение 41.
Пример вывода:
105.8 */

/* Ответ */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуры в градусах ТС = ");
        float cels = scanner.nextFloat();
        System.out.println("Вы ввели "+cels+" градусов по ТС");
        float frg = (9*cels/5 + 32);
        System.out.println("Вывод это " + frg + " градусов по Фаренгейту FT");
    }
}
