/* Вариант №1 */ 
public class Main {
    
    public static void main(String[] args) {
       int a,b,c,d,e;
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        e = 5;
        System.out.println(a);
        System.out.println(a+b);
        System.out.println(a+b+c);
        System.out.println(a+b+c+d);
        System.out.println(a+b+c+d+e);
    }
}
// ------------------------------------------------------------------------
/* Вариант №2 */

public class Main {
    
    public static void main(String[] args) {
        int sum = 0;
        for (int number = 1; number <= 5; number++) {
            sum += number;
            System.out.println(sum);
        }
    }
}
