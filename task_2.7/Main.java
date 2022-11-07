/*
Задача:
Напиши код метода sumDigitsInNumber(int number). 
Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.
Пример:
Метод sumDigitsInNumber вызывается с параметром 546.
Пример вывода:
15
*/
// ------------------------------------------------------------------------

public class Main {
    
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sum = number % 10;
        if (number / 10 < 10) {
            return sum + number / 10;
        } else {
            return sum + sumDigitsInNumber(number / 10);
        }
    }
}
