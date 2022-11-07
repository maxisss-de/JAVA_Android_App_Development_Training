public class Main {
    
    public static int min(int a, int b, int c) {
        if (a>b) {
            if (b>c) return c;
            else if (a==b) {
                if (a>c) return c;
                else return a;
            }
            else return b;
        }
        else return a;
    }
    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
